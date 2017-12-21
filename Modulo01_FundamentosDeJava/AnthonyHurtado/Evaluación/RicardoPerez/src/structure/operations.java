/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structure;

import exceptions.myExceptions;
import java.util.ArrayList;
import storeclass.MovieClass;

/**
 * Interfaz para aplicar a las tiendas de peliculas.
 *
 * @author RicardoPerez
 * @version 1.0.0
 */
public interface operations {

    /**
     * Método para agregar una pelicula a la tienda.
     *
     * @param _movieadd Objeto de la pelicula a agregar
     * @return MovieClass del objeto agregado
     */
    public abstract MovieClass addMovies(MovieClass _movieadd);

    /**
     * Método para eliminar una pelicula a la tienda.
     *
     * @param position int correspondiente a la numeracion de la pelicula
     * @throws myExceptions
     */
    public abstract void removeMovie(int position) throws myExceptions;

    /**
     * Método para listar las peliculas de una tienda.
     *
     * @return ArrayList de peliculas
     * @throws myExceptions
     *
     */
    public abstract ArrayList<MovieClass> indexMovie() throws myExceptions;

    /**
     * Método para listar una pelicula en especifica.
     *
     * @param position int posicion de pelicula a eliminar
     * @return MovieClass objeto de las peliculas
     * @throws myExceptions
     */
    public abstract MovieClass showMovie(int position) throws myExceptions;

    /**
     * Método para editar una pelicula a la tienda.
     *
     * @param position int correspondiente a la numeracion de la pelicula
     * @param peliculaedit MovieClass correspondiente al nuevo objeto
     * correspondiente a la edicion
     * @throws myExceptions
     *
     */
    public abstract void editMovie(int position, MovieClass peliculaedit) throws myExceptions;

}
