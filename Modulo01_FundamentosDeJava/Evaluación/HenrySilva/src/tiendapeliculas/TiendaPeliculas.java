package tiendapeliculas;
import Estructuras.*;
import operaciones.Operaciones;
import Excepciones.Excepciones;
import java.util.*;

/**
 * Proceso Principal del Sistema
 * @author Henry Silva
 * @version 1.0
 */
public class TiendaPeliculas {
    /**
     * @param args Argumentos iniciales.
     */
    public static void main(String[] args) {
        // Atributos de la clase
        String tipoPelicula ;
        int opcion;
        String nombre;
        
        // Instancias de Clase        
        Scanner scan = new Scanner(System.in);
        Pelicula pelicula = null;
        /**
         * Este Error No pude Resolverlo
         */
        //Este Error no pude Resolverlo
        Operaciones op = new Operaciones();
        
         // Bienvenida al usuario
        System.out.println("================");
        System.out.println("Hola, Introduzca la opción deseada");

        do {
            // Imprimo las opciones
            System.out.println("================");
            System.out.println("Operaciones:");
            System.out.println("1 - Listar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Eliminar");
            System.out.println("4 - Agregar");
            System.out.println("5 - Salir");
            System.out.print("Opción: ");
            opcion = scan.nextInt();
            
            // Validar opcion seleccionada
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    System.out.print("Indique el nombre de la película a consultar: ");
                    nombre = scan.nextLine();
                    System.out.println("Su pelicula es : "+ op.consultar(pelicula, nombre));
                    break;
           }
        } while(opcion != 5);
        
        // Despedida
        System.out.println("¡Gracias!");
    } 
}