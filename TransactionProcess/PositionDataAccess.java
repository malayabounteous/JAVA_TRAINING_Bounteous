package TransactionProcess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PositionDataAccess {
    public void insertAll(List<Position> positions)throws SQLException
    {
        String q= """
                insert into positions values(?,?,?,?,?,NOW())
                """;
        Connection con=DB.getConnected();
        PreparedStatement ps=con.prepareStatement(q);
        for(Position p:positions)
        {
            ps.setInt(1,p.getAccountId());
            ps.setString(2,p.getSymbol());
            ps.setInt(3,p.getNetQuantity());
            ps.setDouble(4,p.getAverageCost());
            ps.setDouble(5,p.getTotalCost());
            ps.addBatch();
        }
        ps.executeBatch();
        con.commit();
    }

    public List<Position> findall() throws SQLException
    {
        List<Position>res=new ArrayList<>();
        String q="select accountId,symbol,netQuantity,averageCost,totalCost from positions order by accountId";

        Connection con=DB.getConnected();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(q);

        while(rs.next())
        {
            Position p=new Position(rs.getInt("accountId"),rs.getString("symbol"));
            int qty=rs.getInt("netQuantity");
            p.applyBuy(qty,rs.getDouble("averageCost"));
            res.add(p);
        }
        return res;
    }
}
