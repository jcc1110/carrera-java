/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.util.ArrayList;

/**
 *
 * @author Edgar Contreras
 */
public class Pelicula {
    /**
     * Nombre de la Pelicula
     */
    private String nombre;
    
    /**
     * Nombre del Director del Film
     */
    private String director;
    
    /**
     * Genero de la Pelicula
     */
    private String genero;
    
    /**
     * Año de Lanzamiento
     */
    private int año;
    
    /**
     * Identificacion unica de una pelicula(La cual revela la poscicion del Objeto, si este fuese contenido en un arreglo)
     */
    private int ID;
    
    
    /**
     * Constructor de la clase Cliente inicializando los valores.
     * @param _nombre Nombre de la pelicula
     * @param _director Nombre del director de la pelicula
     * @param _genero Genero de la pelicula
     * @param _año Año de lanzamiento de la pelicula
     * @param _ID Identificacion unica de la pelicula
     */

    public Pelicula(String _nombre, String _director, String _genero, int _año, int _ID) {
        this.nombre = _nombre;
        this.director = _director;
        this.genero = _genero;
        this.año = _año;
        this.ID = _ID;
    }
    
    /**
     * Obtener el nombre del Film
     * @return String Nombre del Film.
     */
    public String getNombrePelicula() {
        return this.nombre;
    }
    
    /**
     * Obtener el Nombre del Director del Film.
     * @return String Nombre del Director.
     */
    public String getDirector() {
        return this.director;
    }
    
    /**
     * Obtener el tipo de Genero de la Pelicula.
     * @return String Tipo de genero de la Pelicula.
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     * Obtener el año de lanzamiento.
     * @return int Año del Film.
     */
    public int getAño() {
        return this.año;
    }
    
    /**
     * Obtener el ID de la Pelicula.
     * @return int ID de la Pelicula.
     */
    public int getID() {
        return this.ID;
    }

    public String setNombre(String _nombre) {
        this.nombre = _nombre;
        return _nombre;
    }

    public void setDirector(String _director) {
        this.director = _director;
    }

    public String setGenero(String _genero) {
        this.genero = _genero;
        return _genero;
    }

    public int setAño(int _año) {
        this.año = _año;
        return _año;
    }

    public int setID(int _ID) {
        this.ID = _ID;
        return _ID;
    }
    
    
    
}
