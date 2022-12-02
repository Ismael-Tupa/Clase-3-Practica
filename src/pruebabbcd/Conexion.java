package pruebabbcd;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ISMAEL
 */
public class Conexion {
    static Connection con;
        //conexion local
    public static Connection getInstance(){
        try{
            if(con == null){
                con = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return con;
    }  
}
