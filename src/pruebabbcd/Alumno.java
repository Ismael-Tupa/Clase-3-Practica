package pruebabbcd;

/**
 *
 * @author ISMAEL
 */
public class Alumno {
    private String nombre;
    private int promo;
    public Alumno(){}
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public void setPromo(int pro){
        this.promo = pro;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getPromo(){
        return this.promo;
    }
}
