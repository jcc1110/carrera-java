/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import tienda.*;
import excepcion.MiExPeli;
import java.util.*;

/**
 * Punto principal para la Tienda de Peliculas
 *
 * @author Janett Baptista
 * @version 1.0
 */
public class Negocio {

    /**
     * @param args Argumentos iniciales.
     */
    static String nombrePelicula;
    static String generoPelicula;
    static int cantidadPelicula;
    static int opcion = 0;
    static int indice = 0;
    static int ultimo = 0;
    static int posicion = 0;

    public static void main(String[] args) {
        // Atributos de la clase

        // Instancias de Clase        
        Scanner scan = new Scanner(System.in);
        Tienda tienda = new Tienda("Super Movie", "Chacao - SAMBIL - Nivel Acuario");
        Operaciones op = new Operaciones();
        // Bienvenida de la tienda
        System.out.println("Bienvenido/a  " + tienda.getNombreTienda() + " de " + tienda.getUbicacionTienda());

        do {
            // Imprimo las opciones
            System.out.println("================");
            System.out.println("Operaciones:");
            System.out.println("1 - Listar Peliculas");
            System.out.println("2 - Buscar Pelicula");
            System.out.println("3 - Agregar Pelicula");
            System.out.println("4 - Modificar Pelicula");
            System.out.println("5 - Eliminar Pelicula");
            System.out.println("6 - Salir");
            System.out.print("Opción: ");
            try {
                opcion = scan.nextInt();
            } catch (Exception ex) {
                System.out.println("Error en la captura de la opcion " + ex);
                break;
            }
            // Validar opcion seleccionada
            switch (opcion) {
                case 1:
                    ultimo = tienda.bdPeliculas.size();
                    System.out.println("Peliculas disponibles: ");
                    for (indice = 0; indice < ultimo; indice = indice + 1) {
                        System.out.println(tienda.bdPeliculas.get(indice).getNombrePelicula());
                    }
                    break;
                case 2:
                    try {

                        System.out.print("Titulo de la Pelicula a Buscar : ");
                        String nombreP = scan.next();
                        posicion = op.buscarPelicula(nombreP, tienda);
                        System.out.println("Detalle de la pelicula: ");
                        System.out.println("Nombre: " + tienda.bdPeliculas.get(posicion).getNombrePelicula());
                        System.out.println("Genero: " + tienda.bdPeliculas.get(posicion).getGeneroPelicula());
                        System.out.println("Disponible: " + tienda.bdPeliculas.get(posicion).getCantidadPelicula());

                    } catch (MiExPeli e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Titulo de la Pelicula: ");
                    String nombreP = scan.next();
                    System.out.println("Genero de la Pelicula: ");
                    String generoP = scan.next();
                    System.out.println("Cantidad de Peliculas de este Titulo: ");
                    int cantidadP = scan.nextInt();
                    Pelicula laPelicula = new Pelicula(nombreP, generoP, cantidadP);
                    tienda.bdPeliculas.add(laPelicula);
                    break;
                case 4:
                    try {
                        System.out.println("Titulo de la Pelicula a Modificar: ");
                        String nombreModificar = scan.next();
                        posicion = op.buscarPelicula(nombreModificar, tienda);
                        System.out.println("Nuevo titulo de la Pelicula: ");
                        String nombreNew = scan.next();
                        System.out.println("Nueva cantidad de Peliculas de este Titulo: ");
                        int cantidadNew = scan.nextInt();
                        System.out.println("Nuevo genero de la Pelicula: ");
                        String generoNew = scan.next();
                        Pelicula newPelicula = new Pelicula(nombreNew, generoNew, cantidadNew);
                        tienda.bdPeliculas.set(posicion, newPelicula);
                    } catch (MiExPeli e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Titulo de la Pelicula a eliminar: ");
                        String nombreDelete = scan.next();
                        posicion = op.buscarPelicula(nombreDelete, tienda);
                        tienda.bdPeliculas.remove(posicion);
                        System.out.println("Pelicula Eliminada!");

                    } catch (MiExPeli e) {
                        System.out.println(e);
                    }

                    break;
                case 6:
                    System.out.println("Usted ha seleccionado salir");
                    break;
                default:
                    System.out.println("Se ha ingreaso una opcion no valida");
                    break;
            }
        } while (opcion != 6);
    }
}