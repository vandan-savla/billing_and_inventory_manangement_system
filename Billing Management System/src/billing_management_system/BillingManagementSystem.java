
package billing_management_system;
import java.sql.*;
public class BillingManagementSystem {
    
    
    public static Connection getConnection()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_system","root","admin");
            return con;
        }catch(Exception e){
            return null;
        }
    }
    public static void main(String[] args) {
       new Login().setVisible(true);
        
    }
    
}
