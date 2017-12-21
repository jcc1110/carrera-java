/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeclass;

import exceptions.myExceptions;
import java.util.ArrayList;
import structure.SuperStore;
import structure.operations;

/**
 * Clase de las tiendas las cuales deben heredar de SuperStore y a su vez
 * implementar las operaciones de la interfaz operation
 *
 * @version 1.0.0
 * @author RicardoPerez
 *
 */
public class MovieStore extends SuperStore implements operations {

    /**
     * Constructor de la clase la cual se inicializa con la de superStore
     *
     * @param _nombre nombre de la tienda
     * @param _direccion direccion de la tienda
     * @version 1.0.0
     * @author RicardoPerez
     */
    public MovieStore(String _nombre, String _direccion) {
        super(_nombre, _direccion);
        super.peliculas = new ArrayList<>();
        super.peliculas.add(new MovieClass("Que paso Ayer?", "Comedia", "2:15H"));
        super.peliculas.add(new MovieClass("007", "Acción", "1:30H"));
        super.peliculas.add(new MovieClass("Bourne", "Acción", "1:45H"));
        super.peliculas.add(new MovieClass("Xmen", "Acción", "2:00H"));
        super.peliculas.add(new MovieClass("Harry Potter", "Accion", "2:30H"));
        super.peliculas.add(new MovieClass("Shrek", "Comedia", "1:30H"));
        super.peliculas.add(new MovieClass("La Libelula", "Suspenso", "2:20H"));
        super.peliculas.add(new MovieClass("El último Samurai", "Acción/Drama", "2:40H"));
        super.peliculas.add(new MovieClass("Pearl Harbor", "Drama/Acción", "2:30H"));
        super.peliculas.add(new MovieClass("Gladiador", "Acción", "2:30H"));

    }

    /**
     * Obtener el nombre completo de la tienda.
     *
     * @return String Nombre de la tienda.
     */
    public String getNombre() {
        return super.nombre;
    }

    /**
     * Obtener la direccion de la tienda.
     *
     * @return String Direccion de la tienda.
     */
    public String getDireccion() {
        return super.direccion;
    }

    /**
     * Metodo que permite agregar una pelicula al array.
     *
     * @param _movieadd MovieClass objeto de tipo pelicula
     * @return MovieClass objeto de tipo pelicula que fue agregado
     * @throws myExceptions
     */
    @Override
    public MovieClass addMovies(MovieClass _movieadd) {
        super.peliculas.add(_movieadd);
        return _movieadd;
    }

    /**
     * Metodo que permite eliminar una pelicula que se encuentra cargada dentro
     * del array.
     *
     * @param position int posicion de la pelicula a eliminar dentro del array
     * @throws myExceptions
     */
    @Override
    public void removeMovie(int position) throws myExceptions {

        if (position < 0) {
            throw new myExceptions("La posicion no debe ser negativa");
        } else if (position > super.peliculas.size() - 1) {
            throw new myExceptions("Posicion no valida");
        } else if (super.peliculas.isEmpty()) {
            throw new myExceptions("No posee peliculas");
        } else {
            super.peliculas.remove(position);
            System.out.println("Eliminado con exito");
        }
    }

    /**
     * Metodo que permite obtener el listado de peliculas.
     *
     * @throws myExceptions
     * @return devuelve el array de peliculas
     */
    @Override
    public ArrayList<MovieClass> indexMovie() throws myExceptions {
        if (super.peliculas.isEmpty()) {
            throw new myExceptions("No posee peliculas");
        } else {
            return super.peliculas;
        }
    }

    /**
     * Metodo que permite editar una pelicula que se encuentra cargada dentro
     * del array.
     *
     * @param peliculaedit MovieClass objeto de tipo pelicula
     * @param position int posicion de la pelicula a editar dentro del array
     * @throws myExceptions
     */
    @Override
    public void editMovie(int position, MovieClass peliculaedit) throws myExceptions {

        if (position < 0) {
            throw new myExceptions("La posicion no debe ser negativa");
        } else if (position > super.peliculas.size() - 1) {
            throw new myExceptions("Posicion no valida");
        } else if (super.peliculas.isEmpty()) {
            throw new myExceptions("No posee peliculas");
        } else {
            super.peliculas.set(position, peliculaedit);
            System.out.println("Editado correctamente");
        }
    }

    /**
     * Metodo que permite mostrar una pelicula en especifico.
     *
     * @param position int posicion especifica de pelicula a mostrar
     * @throws myExceptions
     * @return devuelve la pelicula especifica que se encuentra dentro del array
     */
    @Override
    public MovieClass showMovie(int position) throws myExceptions {

        if (position < 0) {
            throw new myExceptions("La posicion no debe ser negativa");
        } else if (position > super.peliculas.size() - 1) {
            throw new myExceptions("Posicion no valida");
        } else if (super.peliculas.isEmpty()) {
            throw new myExceptions("No posee peliculas");
        } else {
            return super.peliculas.get(position);
        }
    }

    /**
     * Metodo que imprime el array de clientes.
     *
     * @param peliculas ArrayList<MovieClass> array de objetos de peliculas
     */
    public void printarrayMovies(ArrayList<MovieClass> peliculas) {
        int enumerador = 0;
        System.out.println("NOMBRE|GENERO|DURACION");
        for (MovieClass individualmovie : peliculas) {
            System.out.print(enumerador + "-> ");
            System.out.print(individualmovie.getNombre() + "|");
            System.out.print(individualmovie.getGenero() + "|");
            System.out.print(individualmovie.getDuracion());
            System.out.println("");
            enumerador++;

        }
    }

}
