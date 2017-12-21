/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeclass;

/**
 * Clase de las peliculas
 *
 * @version 1.0.0
 * @author RicardoPerez
 */
public class MovieClass {

    /**
     * Nombre de la pelicula
     */
    private String nombre;
    /**
     * Genero de la pelicula
     */
    private String genero;
    /**
     * Duracion de la pelicula
     */
    private String duracion;

    /**
     * Constructor de la pelicula
     *
     * @param _nombre nombre de la pelicula
     * @param _genero genero de la pelicula
     * @param _duracion duracion de la pelicula
     */
    public MovieClass(String _nombre, String _genero, String _duracion) {
        this.nombre = _nombre;
        this.genero = _genero;
        this.duracion = _duracion;
    }

    /**
     * Obtener el nombre de la pelicula.
     *
     * @return String nombre de la pelicula
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establecer el nombre de la pelicula.
     *
     * @param nombre Nuevo nombre de la pelicula
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener el genero de la pelicula.
     *
     * @return String genero de la pelicula
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establecer el genero de la pelicula.
     *
     * @param genero Nuevo genero de la pelicula
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtener la duración de la pelicula.
     *
     * @return String duración de la pelicula
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Establecer la duracion de la pelicula.
     *
     * @param duracion Nueva duracion de la pelicula
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

}
