package TransactionProcess;
import java.util.*;
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
    }
}
