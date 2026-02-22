package TransactionProcess;
import java.time.LocalDateTime;
import java.util.*;

public class Trade {

    private int tradeId;
    private int accountId;
    private String symbol;
    private String side;
    private double price;
    private int quantity;
    //public String status;
    private LocalDateTime timestamp;

    public Trade(int tradeId, int accountId, String symbol, String side, double price, int quantity, LocalDateTime timestamp) {
        if(quantity<=0)
        {
            throw new IllegalArgumentException("Trade quantity must be positive ");
        }

        this.tradeId =tradeId;
        this.accountId =accountId;
        this.symbol =symbol;
        this.side = side;
        this.price = price;
        this.quantity =quantity;
        this.timestamp = timestamp;
        //this.status=status;
    }

    public int getTradeId() {
        return tradeId;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSide() {
        return side;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
//    public String getStatus()
//    {
//        return status;
//    }
    public void setQuantity(int quantity) {
        if(quantity<=0)
        {
            throw  new IllegalArgumentException("quantity must be positive");
        }
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "tradeId=" + tradeId +
                ", accountId=" + accountId +
                ", symbol='" + symbol + '\'' +
                ", side='" + side + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", timestamp=" + timestamp +
                '}';
    }
}
