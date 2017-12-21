/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.util.ArrayList;

/**
 *
 * @author annatata
 */
import Arreglos.Peliculas;
/**
 * Clase padre 
*/
public abstract class BDPELICULAS {
    /**
     * Nombre de la Pelicula
     */
    protected String nombre_Pelicula;
    
    /**
     * Base de datos de Peliculas.
     */
    protected ArrayList<Peliculas> bdPeliculas;
    
    /**
     * Constructor de la clase BDPELICULAS
     * @param _nombrePelicula Nombre de las Peliculas
     */
    public BDPELICULAS(String _nombrePelicula) {
        this.nombre_Pelicula = _nombrePelicula;
    }
    
    /**
     * Valida que la pelicula exista en la base de datos
     * @param _nombrePelicula Nombre de la peliculade  proporcionado por el usuario
     * 
     */
    public abstract Peliculas validarPelicula(String _nombrePelicula);
}
