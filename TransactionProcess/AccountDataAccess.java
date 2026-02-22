package TransactionProcess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDataAccess {

    public List<Account> findall()throws SQLException
    {
       // System.out.println("in find all of account");
        List<Account>ans=new ArrayList<>();
        String q="select accountid,accountname,cashbalance from accounts order by accountid";

        Connection con=DB.getConnected();
        System.out.println("in find all of account");
        PreparedStatement ps=con.prepareStatement(q);
        ResultSet rs=ps.executeQuery();

        while(rs.next())
        {
            Account a=new Account(rs.getInt("accountId"),rs.getString("accountName"),rs.getDouble("cashBalance"));
            ans.add(a);
        }
        return ans;

    }
    public Account findbyId(int id)throws SQLException
    {
        String q="select accountId,accountName,cashBalance from accounts where accountId=?";
        Connection con=DB.getConnected();
        PreparedStatement ps=con.prepareStatement(q);
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            return new Account(rs.getInt("accountId"),rs.getString("accountName"),rs.getDouble("cashBalance"));

        }
        return null;
    }
}
