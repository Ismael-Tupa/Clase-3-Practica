package pruebabbcd;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author ISMAEL
 */
public class controller {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("    menu");
        System.out.println("  1 - agregar alumno");
        System.out.println("  2 - editar alumno");
        System.out.println("  3 -listar alumnos");
        int op = entrada.nextInt();
        if(op == 1){
            Alumno a = new Alumno();
            System.out.println("Nombre del alumno");
            a.setNombre(entrada.nextLine());
            a.setPromo(entrada.nextInt());
            
        }else if(op == 2){
        
        }else if(op == 3){
        
        }
    }
}
