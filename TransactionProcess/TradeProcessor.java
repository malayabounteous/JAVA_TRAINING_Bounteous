package TransactionProcess;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TradeProcessor {
    private static int Thread_Pool_Size=4;

    private Portfolio portfolio;
    private TradeValidator validator;
    private TradeDataAccess tradeDAO;
    private PositionDataAccess positionDAO;

    private AtomicInteger executedCount=new AtomicInteger(0);
    private AtomicInteger rejectedCount=new AtomicInteger(0);

    private List<Trade> processedTrade=new CopyOnWriteArrayList<>();
    public TradeProcessor(Portfolio portfolio)
    {
        this.portfolio=portfolio;
        this.validator=new TradeValidator(portfolio);
        this.tradeDAO=new TradeDataAccess();
        this.positionDAO=new PositionDataAccess();

    }

    public List<Trade> processAll(List<TradeRequest> req)  {
        ExecutorService executor= Executors.newFixedThreadPool(Thread_Pool_Size);
        List<Future<Trade>> futures=new ArrayList<>();
        System.out.println("Starting concurrent process");
        for(TradeRequest r:req)
        {
            futures.add(executor.submit(()->processOne(r)));
        }
        for(Future<Trade> future:futures)
        {
            try{
                Trade result= future.get();
                if(result!=null) {
                    //System.out.println("inside rs");
                    processedTrade.add(result);
                }
            }
            catch (Exception e)
            {

            }

        }
        executor.shutdown();

        return Collections.unmodifiableList(processedTrade);

    }
    private Trade processOne(TradeRequest req)
    {
        String threadname=Thread.currentThread().getName();
        System.out.println("Processing "+threadname+" ,"+req);
        Trade trade=new Trade(req.getTradeId(),req.getAccountId(),req.getSymbol(),req.getSide(),req.getPrice(),req.getQuantity(), LocalDateTime.now());

        int valid=validator.validate(req);
        //System.out.println("inside peocessOne"+trade);
        if(valid==0)
        {
            System.out.println("Trade rejected id-"+req.getTradeId());
        }
        else{
            portfolio.applyTrade(trade);
            executedCount.incrementAndGet();
            System.out.println("Executed count="+executedCount.get());
            System.out.println("Executed "+threadname+" ,"+req.getTradeId());
        }
        System.out.println("inside processOne");
        return trade;

    }

    private void saveTrade(){
        try{
            tradeDAO.insertBatch(new ArrayList<>(processedTrade));

        }
        catch (Exception e)
        {
            System.out.println("data base erro in saveTrade");
        }
    }

    private void savePosition()
    {
        try{
            positionDAO.insertAll(portfolio.getAllPosition());
        }
        catch(Exception e)
        {
            System.out.println("data base error in save position");
        }
    }
    public int getExecutedCount()
    {
        return executedCount.get();
    }
    public int getRejectCount()
    {
        return rejectedCount.get();
    }
}
