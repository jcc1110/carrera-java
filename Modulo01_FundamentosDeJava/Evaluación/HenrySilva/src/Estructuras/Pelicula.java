
package Estructuras;

/**
 * Clase Pelicula
 * @author Henry Silva
 * @version 1.0
 */
public class Pelicula {
    /**
     * Nombre de Pelicula
     */
    private String nombre;
    
    /**
     * Apellido del cliente
     */
    private String tipoPelicula;
    
    /**
    
    /**
     * Constructor de la clase Pelicula
     * @param _nombre Nombre 
     * @param _tipoPelicula Tipo de Pelicula
     */
    public Pelicula(String _nombre, String _tipoPelicula) {
        this.nombre = _nombre;
        this.tipoPelicula = _tipoPelicula;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public String gettipoPelicula() {
        return this.tipoPelicula;
    }
}