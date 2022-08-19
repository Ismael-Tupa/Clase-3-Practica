
package pruebabbcd;

import java.sql.SQLException;
import java.sql.*;

/**
 * @author ISMAEL
 */
public class PruebaBBCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = null;
        
        final String url = "jdbc:mysql://localhost:3306/";
        final String dbName = "bd_ins";
        final String driver = "com.mysql.jdbc.Driver";
        final String user = "root";
        final String pass = "";
        
        try{
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName, user, pass);
            if(!conn.isClosed())
                System.out.println("Database connection working using TCP/IP..");
            
            PreparedStatement pst = conn.prepareStatement("SELECT * from alumno");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("nombre"));
            };
            
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }finally{
            try{
                if(conn != null)
                    conn.close();
            }catch(SQLException e){
                
            }
        }
    }
}
