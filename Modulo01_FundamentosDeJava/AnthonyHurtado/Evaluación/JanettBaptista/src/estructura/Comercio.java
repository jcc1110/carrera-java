/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

import tienda.Pelicula;
import java.util.ArrayList;

/**
 * Clase padre para establecer lineamientos para las Tiendas.
 * @author Janett Baptista
 * @version 1.0
 */
public abstract class Comercio {
    /**
     * Nombre de la Tienda.
     */
    protected String nombreTienda;
    
    /**
     * Ubicación fisica de la Tienda.
     */
    protected String ubicacionTienda;
    
    /**
     * Base de datos de Peliculas.
     */
    public ArrayList<Pelicula> bdPeliculas;
    
    /**
     * Constructor de la clase Comercio
     * @param _nombreTienda Nombre de la Tienda
     * @param _ubicacionTienda Ubicación fisica de la Tienda
     */
    public Comercio(String _nombreTienda, String _ubicacionTienda) {
        this.nombreTienda = _nombreTienda;
        this.ubicacionTienda = _ubicacionTienda;
    }
}