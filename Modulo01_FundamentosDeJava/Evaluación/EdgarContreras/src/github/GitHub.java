/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import Estructura.*;
import java.util.*;

/**
 *
 * @author Edgar Contreras
 */
public class GitHub {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las Variables.
        int opcion, busqueda;
        String id;
        
        //Instacio los Objetos.
        Scanner teclado = new Scanner(System.in);
        Tienda_Peliculas cuzco = new Tienda_Peliculas("Cuzco","Venezuela, Caracas, Edificio EXA");
        Operaciones op = new Operaciones();
        
        //Presentacion
        System.out.println("Bienvenido/a la Tienca " + cuzco.getNombre() +" de "+ cuzco.getDireccion());
        
        do {
            // Imprimo las opciones.
            System.out.println("================");
            System.out.println("Operaciones:");
            System.out.println("1 - Listar");
            System.out.println("2 - Buscar");
            System.out.println("3 - Modificar");
            System.out.println("4 - Elminar");
            System.out.println("5 - Añadir");
            System.out.println("6 - Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
            
            // Validar opcion seleccionada
            switch (opcion) {
                case 1: System.out.println(op.Listar(cuzco.bdPeliculas));
                break;
                case 2: System.out.println("Ingrese Tipo de Busqueda");
                        System.out.println("1 - Por Nombre");
                        System.out.println("2 - Por Director");
                        System.out.println("3 - Por Genero");
                        busqueda = teclado.nextInt();
                         switch (busqueda) {
                             case 1: System.out.println("Ingrese el Nombre a Buscar");
                                    id = teclado.next();
                                 System.out.println(op.BuscarPorNombre(cuzco.bdPeliculas, id));break;
                             case 2:System.out.println("Ingrese el Director a Buscar");
                                    id = teclado.next();
                                 System.out.println(op.BuscarPorDirector(cuzco.bdPeliculas, id)) ;break;
                             case 3: System.out.println("Ingrese el Genero a Buscar");
                                    id = teclado.next();
                                 System.out.println(op.BuscarPorGenero(cuzco.bdPeliculas, id));break;
                             default: System.out.println("Opcion Erronea");
                         }
                break;
                case 3: op.Modificar(cuzco.bdPeliculas); 
                break;
                case 4: System.out.println("Ingrese el Nombre de la pelicula a Eliminar");
                                    id = teclado.next(); 
                    op.Eliminar(cuzco.bdPeliculas, id);
                break;
                case 5:op.Añadir(cuzco.bdPeliculas); 
                break;}
                 
            }while(opcion!=6);
        
        System.out.println("Gracias..");
        System.out.println("Hasta Luego");
        }
        }



