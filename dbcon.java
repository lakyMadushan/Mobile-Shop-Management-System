import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbcon {
    public static Connection c;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/digimax_mobile_database";
            String un = "root";
            String pw = "lak170BG@";
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/digimax_mobile_database?useSSL=false","root","lak170BG@");
                      
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void IUD(String Query) throws Exception{ // I - insert / U - update / D - delete
        Statement s = c.createStatement();
        s.executeUpdate(Query);
    }
    public static ResultSet SEARCH(String query) throws Exception{
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(query);
        return rs;
    }

    static void IDU(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
