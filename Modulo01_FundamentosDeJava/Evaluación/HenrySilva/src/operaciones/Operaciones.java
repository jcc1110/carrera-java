package operaciones;
import Estructuras.*;
import Excepciones.Excepciones;
/**
 * Clase Operaciones Implementa todos los métodos abstractos de la Interfaz "Sistema".
 * @author Henry Silva
 * @version 1.0
 */

public class Operaciones extends Inventario implements Sistema {

    int i;
    Pelicula posicion;
    String nombrepelicula;
    

    public Operaciones(String _nombreInventario, String _ubicacionInventario) {
        super(_nombreInventario, _ubicacionInventario);

 }

    @Override
    public Pelicula listar(Pelicula pelicula) {
        posicion =bdPeliculas.get(i);
        System.out.println("Pelicula: "+bdPeliculas[i]);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pelicula consultar (Pelicula pelicula, String _nombre) {
        throw new UnsupportedOperationException ("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pelicula agregar(Pelicula pelicula, String _nombre) throws Excepciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pelicula eliminar(Pelicula pelicula, String _nombre) throws Excepciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
