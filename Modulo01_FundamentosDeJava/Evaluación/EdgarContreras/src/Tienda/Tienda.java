/*
 * En este paquete se trabaja la funcionalidad y atributos detras del Sistema de Peliculas
 */
package Tienda;

import java.util.ArrayList;
import Estructura.Pelicula;

/**
 * Clase padre para establecer Estandar de datos de tiendas. 
 * @author Edgar Contreras
 */
public abstract class  Tienda {
    /**
     * Direccion Fisica del Local.
     */
    private String direccion;
    /**
     * Nombre del Local
     */
    private String nombre;
    
    /**
     * Nombre de la BASE DE DATOS
     */
    public ArrayList<Pelicula> bdPeliculas;
    
    /**
     * Constructor de la clase Tienda
     * @param _nombre Nombre del Local.
     * @param _direccion Ubicación fisica del Local.
     */
    public Tienda(String _nombre, String _direccion) {
        this.direccion = _direccion;
        this.nombre = _nombre;
    }
    
    /**
     *  Obtenemos un resultado de la existencia del Producto.
     * @param _pelicula Variable donde se busca la existencia de una pelicula
     * @return Verdadero o Falso segun se de el caso de existencia.
     */
    public abstract boolean ValidarProducto(ArrayList<Pelicula> _pelicula);   

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
