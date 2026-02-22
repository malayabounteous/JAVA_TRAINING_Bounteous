package TransactionProcess;

public class TradeValidator {

    private Portfolio portfolio;
    public TradeValidator(Portfolio p)
    {
        this.portfolio=p;
    }
    public int validate(TradeRequest trade)
    {
        if(trade.getQuantity()<=0)
        {
            System.out.println("Trade Quantity must be greater than 0");
            return 0;
        }
        if(trade.getPrice()<=0)
        {
            System.out.println("Trade price must be grater than 0");
            return 0;
        }
        if(!portfolio.accountExists(trade.getAccountId()))
        {
            System.out.println("Trade account not find");
            return 0;
        }
        System.out.println("Trade is valid id-"+trade.getTradeId());
        return 1;
    }
}
