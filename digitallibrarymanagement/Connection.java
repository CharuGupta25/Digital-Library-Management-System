package Database;
        
import java.sql.*;

public class Connection {
  
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","@jSR2509cg");
            return con;
        }
        catch(Exception e)
        {
            System.out.print(e);
            return null;
        }
        
     
    }

    public Statement CreateStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
