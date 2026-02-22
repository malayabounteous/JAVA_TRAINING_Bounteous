package TransactionProcess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    private static String url="jdbc:postgresql://localhost:5432/Study";
    private static String pass="postgres";
    private static String user="postgres";

    public static Connection getConnected() throws SQLException
    {
        //System.out.println("in getconnected DB");
        return DriverManager.getConnection(url,user,pass);
    }

}
