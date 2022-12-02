package pruebabbcd;

/**
 *
 * @author ISMAEL
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class modelo {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public int Agregar(Alumno a){
        int res = 1;
        String sql = "insert into alumnos values (?,?,?)";
        try{
            con = Conexion.getInstance();
            ps = con.prepareStatement(sql);
            ps.setString(1, "0");
            ps.setString(2, a.getNombre());
            ps.setInt(3, a.getPromo());
            ps.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            res = 2;
        }
        return res;
    }
}
