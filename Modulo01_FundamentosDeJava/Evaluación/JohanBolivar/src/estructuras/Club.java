package estructuras;

import java.util.ArrayList;
import tienda.Peliculas;

/**
 * Clase padre para establecer lineamientos para las Tiendas.
 * @author JOHAN
 * @version 1.0.0
 */
public abstract class Club {
    /**
     * Nombre de la tienda.
     */
    protected String nombre;
    /**
     * Dirección de la Tienda.
     */
    protected String direccion;
    /**
     * Base de datos de la Tienda
     */
    protected ArrayList<Peliculas> bdPeliculas;
    /**
     * Constructor de la clase Club
     * @param _nombre Nombre de la tienda
     * @param _direccion Dirección de la Tienda
     */
    public Club(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
   
    }
     /**
     * Valida que una peícula exista en la base de datoa
     * @param tituloPelicula título de la película introducido por teclado
     * @return pelicula encontrada
     */
     public abstract Peliculas buscarPelicula(String tituloPelicula);
    
    
    
}
