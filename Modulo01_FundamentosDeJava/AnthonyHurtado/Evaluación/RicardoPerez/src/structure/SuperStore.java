/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structure;

import java.util.ArrayList;
import storeclass.MovieClass;

/**
 * Clase padre para establecer lineamientos a las tiendas de peliculas.
 *
 * @author Ricardo Perez
 * @version 1.0.0
 */
public abstract class SuperStore {

    /**
     * Nombre de la tienda.
     */
    protected String nombre;
    /**
     * Direccion de la tienda.
     */
    protected String direccion;
    /**
     * Conjunto de peliculas de la tienda.
     */
    protected ArrayList<MovieClass> peliculas;

    /**
     * Constructor de la clase SuperStore
     *
     * @param _nombre nombre de la tienda
     * @param _direccion direcciond e la tienda
     */
    public SuperStore(String _nombre, String _direccion) {
        this.nombre = _nombre;
        this.direccion = _direccion;
    }

}
