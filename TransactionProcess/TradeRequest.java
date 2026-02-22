package TransactionProcess;

public class TradeRequest {

    private int tradeId;
    private int accountId;
    private String symbol;
    private String side;
    private int quantity;
    private double price;

    public TradeRequest(int tradeId,  int accountId,String symbol, int quantity,double price, String side) {
        this.tradeId = tradeId;
        this.price = price;
        this.quantity = quantity;
        this.side = side;
        this.symbol = symbol;
        this.accountId = accountId;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSide() {
        return side;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getTradeId() {
        return tradeId;
    }

    @Override
    public String toString() {
        return "TradeRequest{" +
                "tradeId=" + tradeId +
                ", accountId=" + accountId +
                ", symbol='" + symbol + '\'' +
                ", side='" + side + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
