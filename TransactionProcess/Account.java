package TransactionProcess;

import java.util.*;

public class Account {
    private int accountId;
    private String accountName;
    private double cashBalance;

    private List<Trade>trades=new ArrayList<>();
    private List<Position>positions=new ArrayList<>();

    public Account(int accid,String accname,double bal)
    {
        accountId=accid;
        accountName=accname;
        cashBalance=bal;
    }

    public void addTrade(Trade trade)
    {
        trades.add(trade);
    }
    public  void addPosition(Position p)
    {
        positions.add(p);
    }

    public List<Trade> getTrades() {
        return trades;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public double getCashBalance() {
        return cashBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountId() {
        return accountId;
    }

     @Override
    public String toString()
    {
        return "Account_id='" + accountId + "', name='" + accountName + "', cash=" + cashBalance + " ";
    }

}
