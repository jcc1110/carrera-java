/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;
public class Pelicula {
 
    /**
 * Clase Pelicula
 * @author Janett Baptista
 * @version 1.0
 */
   /**
     * Nombre de la Pelicula
     */
    private String nombrePelicula;
    
    /**
     * Genero de la Pelicula
     */
    private String generoPelicula;
    
    /**
     * Existencia de la Pelicula
     */
    private int cantidadPelicula;
    
    /**
     * Constructor de la clase Pelicula
     * @param _nombrePelicula Nombre de la Pelicula
     * @param _generoPelicula Genero de la Pelicula
     * @param _cantidadPelicula Existencia de la Pelicula
     */
    public Pelicula(String _nombrePelicula, String _generoPelicula, int _cantidadPelicula) {
        this.nombrePelicula = _nombrePelicula;
        this.generoPelicula = _generoPelicula;
        this.cantidadPelicula = _cantidadPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public int getCantidadPelicula() {
        return cantidadPelicula;
    }

    public void setCantidadPelicula(int cantidadPelicula) {
        this.cantidadPelicula = cantidadPelicula;
    }
}