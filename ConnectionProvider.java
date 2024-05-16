package Project;
import java.sql.*;


public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Con=DriverManager.getConnection("jdbc:mysql: //localhost:3306/gms","root","46614");
            return Con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
