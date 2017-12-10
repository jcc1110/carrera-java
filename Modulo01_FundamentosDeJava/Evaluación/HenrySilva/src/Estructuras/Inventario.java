package Estructuras;
import java.util.ArrayList;

/**
 * Clase padre para establecer lineamientos de la tienda.
 * @author Henry SIlva
 * @version 1.0
 */
public abstract class Inventario {
    /**
     * Nombre del Inventario.
     */
    protected String nombre;
    
    /**
     * Ubicación fisica.
     */
    protected String ubicacionInventario;
    
    /**
     * Base de datos de Peliculas.
     */
    public ArrayList<Pelicula> bdPeliculas;
    
    /**
     * Constructor de la clase Inventario
     * @param _nombreInventario Nombre del Inventario
     * @param _ubicacionInventario Ubicación fisica
     */
    public Inventario(String _nombreInventario, String _ubicacionInventario) {
        this.nombre = _nombreInventario;
        this.ubicacionInventario = _ubicacionInventario;
    }
    
    /**
     * Valida que un cliente exista en la base de datos
     * @param _tipoPelicula Numero de cuenta de cliente proporcionado por el usuario
      * @return Cliente Cliente encontrado
     */
    //public abstract Pelicula ExtraerPelicula (String _tipoPelicula);
}
/**
 *
 * @author hslvm
 */

