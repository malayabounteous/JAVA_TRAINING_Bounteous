package TransactionProcess;

public class Position {
    private int accountId;
    private String symbol;

    private double averageCost=0.0;
    private double totalCost=0.0;
    private int netQuantity=0;
    public Position(int acc,String s)
    {
        accountId=acc;
        symbol=s;
    }
    public void applyBuy(int quantity,double price)
    {
        totalCost=totalCost+quantity*price;
        netQuantity+=quantity;
        averageCost=totalCost/netQuantity;
    }
    public void applySell(int qty)
    {
        if(qty>netQuantity)
        {
            throw new IllegalArgumentException("insuffcient quantity to sell");
        }
        netQuantity-=qty;
        totalCost=averageCost*netQuantity;
    }
    public int getAccountId() {
        return accountId;
    }

    public int getNetQuantity() {
        return netQuantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getAverageCost() {
        return averageCost;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Position{" +
                "accountId=" + accountId +
                ", symbol='" + symbol + '\'' +
                ", averageCost=" + averageCost +
                ", totalCost=" + totalCost +
                ", netQuantity=" + netQuantity +
                '}';
    }
}
