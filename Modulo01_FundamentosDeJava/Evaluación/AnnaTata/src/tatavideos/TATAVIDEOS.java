/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tatavideos;

/**
 *
 * @author annatata
 */
import java.util.ArrayList;
import Arreglos.Peliculasarreglo;
import Arreglos.OpcionesTienda;
import Exception.Exception;
import java.util.*;
 
public class TATAVIDEOS {
    /**
     * Método inicial del programa de la TIENDA TATAVIDEOS
     * @param args Argumentos iniciales.
     */
    public static void main(String[] args) {
        // Atributos de la clase
       int opcion;
       String ent_pelicula;
         
// Instancias de Clase        
        Scanner scan = new Scanner(System.in);
       
        OpcionesTienda op = new OpcionesTienda();
      // Instancia mi clase ArrayList
        ArrayList<String> arreglo = new ArrayList<>();
         
        // Bienvenida de la tienda
        System.out.println("Bienvenidos TATAVIDEOS");
        
        do {
            // Imprimo las opciones
            System.out.println("==================");
            System.out.println("      TOP TEM     ");
            System.out.println("1 - Listar Peliculas");
            System.out.println("2 - Buscar Pelicula");
            System.out.println("3 - Agregar Pelicula");
            System.out.println("4 - Modificar Pelicula");
            System.out.println("5 - Eliminar Pelicula");
            System.out.println("6 - Salir");
            System.out.print("Opción: ");
            opcion = scan.nextInt();
            
            // Validar opcion seleccionada
            switch (opcion) {
                case 1:
                    System.out.println(arreglo);  
                    break;
                case 2:
                    try {
                        System.out.print("Indique el nombre de la pelicula: ");
                        ent_pelicula = scan.nextInt();                    
                        if (op.consulta(bdPeliculas) =thrue) {
                             System.out.println("Pelicula Disponible.");
                        } else {
                            System.out.println("Pelicula No Disponible");
                        }
                    } catch (Exception me) {
                        System.out.println("Error: "+ me.getMessage());
                    }
                    break;
                opcion != 6);
        
        // Despedida
        System.out.println("¡Gracias por visitar TATAVIDEOS!");
}

