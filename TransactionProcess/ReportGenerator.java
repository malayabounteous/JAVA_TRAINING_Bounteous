package TransactionProcess;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReportGenerator {

    private List<Trade> trades;
    private List<Position>positions;
    private Collection<Account>accounts;
    private TradeProcessor tp;
    public ReportGenerator(List<Trade>trades,List<Position>positions,Collection<Account>accounts,TradeProcessor tp)
    {
        this.trades=trades;
        this.positions=positions;
        this.accounts=accounts;
        this.tp=tp;
    }
    public void printTradeSummary()
    {
        System.out.println("Trade Summary");
        long total=trades.size();
        long executed=tp.getExecutedCount();
        long rejected=tp.getRejectCount();

        System.out.println("Total Requests="+total);
        System.out.println("Total executed="+executed);
        System.out.println("Total rejected="+rejected);

        Map<Boolean,List<Trade>>mpp=trades.stream().collect(Collectors.groupingBy(t->t.getSide().equals("BUY")));

        System.out.println("Trades Buying are a s follows");
        System.out.println(mpp.get(true));

        System.out.println("Trades Selling are as follows");
        System.out.println(mpp.get(false));

        Map<String,List<Trade>>groupBysymbol=trades.stream().collect(Collectors.groupingBy(t->t.getSymbol()));

        //System.out.println(groupBysymbol);
        for(Map.Entry<String,List<Trade>> t:groupBysymbol.entrySet())
        {
            List<Integer>ids=t.getValue().stream().map(Trade::getTradeId).toList();
            System.out.println("Symbol "+t.getKey()+" has trades ->"+ids);
        }




    }
}
