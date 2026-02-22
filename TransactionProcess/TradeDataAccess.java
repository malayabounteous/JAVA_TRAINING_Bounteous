package TransactionProcess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TradeDataAccess {

    public void insertBatch(List<Trade> trades) throws SQLException {
        String q= """
                insert into trades (tradeid,accountid,symbol,quantity,price,side,timestamp)
                values (?,?,?,?,?,?,?)
                """;
        Connection con=DB.getConnected();
        PreparedStatement ps=con.prepareStatement(q);
        for(Trade t:trades)
        {
            ps.setInt(1,t.getTradeId());
            ps.setInt(2,t.getAccountId());
            ps.setString(3,t.getSymbol());
            ps.setInt(4,t.getQuantity());
            ps.setDouble(5,t.getPrice());
            ps.setString(6,t.getSide());
            ps.setTimestamp(7, Timestamp.valueOf(t.getTimestamp()));
            ps.addBatch();
        }
        ps.executeBatch();
        con.commit();
        System.out.println("Trades inserted to DB");
    }

    public List<Trade> findAccount(int id) throws  SQLException
    {
        List<Trade>result=new ArrayList<>();
        String q="select * from trades where accountid=? order by timestamp";
        Connection con=DB.getConnected();
        PreparedStatement ps=con.prepareStatement(q);
        ps.setInt(1,id);

        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            result.add(convert(rs));
        }
        return result;
    }
    public List<Trade> findAll() throws  SQLException
    {
        List<Trade>res=new ArrayList<>();
        String q="select * from trades order by timestamp";
        Connection con=DB.getConnected();
        Statement ps=con.createStatement();
        ResultSet rs=ps.executeQuery(q);
        while(rs.next())
        {
            res.add(convert(rs));
        }
        return res;
    }

    private Trade convert(ResultSet rs) throws  SQLException
    {
        Trade t=new Trade(
                rs.getInt("tradeid"),
                rs.getInt("accountid"),
                rs.getString("symbol"),
                rs.getString("side"),
                rs.getDouble("price"),
                rs.getInt("quantity"),
                rs.getTimestamp("timestamp").toLocalDateTime()
        );
        return t;
    }
}
