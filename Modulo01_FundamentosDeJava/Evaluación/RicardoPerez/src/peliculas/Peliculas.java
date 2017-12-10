/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas;

import exceptions.myExceptions;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import storeclass.MovieClass;
import storeclass.MovieStore;

/**
 * Punto principal de la tienda de peliculas
 *
 * @author RicardoPerez
 * @version 1.0.0
 */
public class Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //se da la biemvenida
        MovieStore tienda = new MovieStore("BlockBuster", "El rosal");
        System.out.println("Bienvenidos al sistema administrativo de la tienda " + tienda.getNombre() + " ubicada en " + tienda.getDireccion());
        int opcion = 0;
        Scanner scan = new Scanner(System.in);

        // se crea el ciclo repetitivo simulando el menu de la app con sus opciones
        do {
            System.out.println("================");
            System.out.println("Opciones:");
            System.out.println("1 - Index Peliculas");
            System.out.println("2 - Show Peliculas");
            System.out.println("3 - Agregar Peliculas");
            System.out.println("4 - Editar Peliculas");
            System.out.println("5 - Eliminar Peliculas");
            System.out.println("9 - Salir del Sistema");
            System.out.print("Opción: ");
            opcion = scan.nextInt();
            System.out.println("");

            // se ejecuta la accion de la app
            switch (opcion) {
                case 1:
                    try {
                        tienda.printarrayMovies(tienda.indexMovie());
                    } catch (myExceptions ex) {
                        System.out.println("Error:" + ex);
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Las peliculas que se poseen actualmente son:");
                        tienda.printarrayMovies(tienda.indexMovie());
                        System.out.print("Introduzca la pelicula que desea mostrar a detalle");
                        System.out.println("");
                        int posicionshow = scan.nextInt();
                        MovieClass showmovie = tienda.showMovie(posicionshow);
                        System.out.println("El nombre de la pelicula es: " + showmovie.getNombre());
                        System.out.println("El genero de la pelicula es: " + showmovie.getGenero());
                        System.out.println("La duracion de la pelicula es: " + showmovie.getDuracion());

                    } catch (myExceptions ex) {
                        System.out.println("Error:" + ex);
                    }
                    break;
                case 3:
                    System.out.print("Introduzca el nombre de la pelicula:");
                    String nombre = scan.next();
                    System.out.print("Introduzca el genero de la pelicula:");
                    String genero = scan.next();
                    System.out.print("Introduzca la  duracion de la pelicula:");
                    String duracion = scan.next();
                    MovieClass addmovie = new MovieClass(nombre.toUpperCase(), genero.toUpperCase(), duracion.toUpperCase());
                    tienda.addMovies(addmovie);
                    break;
                case 4:
                    try {
                        System.out.println("Las peliculas que se poseen actualmente son:");
                        tienda.printarrayMovies(tienda.indexMovie());
                        System.out.print("Introduzca la pelicula que desea editar por favor introduzca el numero asociado a la pelicula:");
                        int posicion = scan.nextInt();
                        System.out.println("");
                        System.out.print("Introduzca el nuevo nombre:");
                        String nombrenuevo = scan.next();
                        System.out.print("Introduzca el nuevo genero:");
                        String generonuevo = scan.next();
                        System.out.print("Introduzca la nueva duracion:");
                        String duracionnueva = scan.next();
                        MovieClass editmovie = new MovieClass(nombrenuevo.toUpperCase(), generonuevo.toUpperCase(), duracionnueva.toUpperCase());
                        tienda.editMovie(posicion, editmovie);
                    } catch (myExceptions ex) {
                        System.out.println("Error:" + ex);
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Las peliculas que se poseen actualmente son:");
                        tienda.printarrayMovies(tienda.indexMovie());
                        System.out.print("Introduzca la pelicula que desea eliminar por favor introduzca el numero asociado a la pelicula:");
                        System.out.println("");
                        int posiciondelete = scan.nextInt();
                        tienda.removeMovie(posiciondelete);
                    } catch (myExceptions ex) {
                        System.out.println("Error:" + ex);
                    }
                    break;
                case 9:
                    System.out.println("Gracias por usar el sistema administrativo");
                    break;
            }

        } while (opcion != 9);
    }

}
