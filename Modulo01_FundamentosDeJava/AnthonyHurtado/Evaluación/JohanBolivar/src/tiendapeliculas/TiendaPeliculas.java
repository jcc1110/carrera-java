
package tiendapeliculas;

import java.util.Objects;
import java.util.Scanner;
import tienda.Peliculas;
import tienda.*;

/**
 * Punto principal para el cajero automatico.
 * @author JOHAN
 * @version 1.0.0
 */
public class TiendaPeliculas {

    /**
     * Método inicial del programa.
     * @param args Argumentos iniciales.
     */
    public static void main(String[] args) {
         // Atributos de la clase
        Peliculas pelicula;
        int opc;
        String titulo;
        String autor;
        String tipo;
        int anio;
        // Instancias de Clase
        Tienda shop = new Tienda("Video Color Jamin", "Andrés bello");
        // Bienvenida a la Tienda
        System.out.println("Bienvenido/a a la tienda  " + shop.getNombre() + "unicada en "+ shop.getDireccion());
        Scanner scan = new Scanner(System.in);
        do {
            //Menú de opciones
            System.out.println("Seleccione una de las opciones que se muestran a continuación ");
            System.out.println("1.- Listar Peliculas");
            System.out.println("2.- Buscar Pelicula");
            System.out.println("3.- Agregar Pelicula");
            System.out.println("4.- Modificar Pelicula");
            System.out.println("5.- Eliminar Pelicula");
            System.out.println("6.- Salir");
            System.out.print("Escriba su selección: ");
            opc = scan.nextInt();        
        } while(opc < 1 || opc > 6); 
        // Validar opcion seleccionada
        switch(opc){
            case 1:
                
                break;
            case 2:
                do {  
                    System.out.println("Ingrese el nombre de la pelicula para unicarla: ");
                    titulo = scan.nextLine();
                    // Si no encuentra al cliente envio un error
                    pelicula = shop.buscarPelicula("TITANIC2");                    
                    if (Objects.isNull(pelicula)) {
                        System.out.println("Datos incorrectos, por favor intente de nuevo.");         
                    } 
                }while(Objects.isNull(pelicula));
                        
                // Película Localizada
                System.out.println("================");
                System.out.println("La Pelicula, "+ pelicula.getTitulo() + " fue localizada");
                System.out.println("Año de publicacion : "+ pelicula.getAnio());
                System.out.println("Género: "+ pelicula.getTipo());
                System.out.println("Autor: "+ pelicula.getAutor());

                break;
            case 3:
           
                
                System.out.print("Ingrese el nombre de la película: ");
                titulo = scan.next();        
                System.out.print("Ingrese su Autor ");
                autor = scan.next();
                System.out.print("Ingrese su genero ");
                tipo = scan.next();
                System.out.print("Ingrese su Año de publicación ");
                anio = scan.nextInt();
                Peliculas peli = new Peliculas(titulo,autor,tipo,anio);
                System.out.println(peli.getTitulo()+ peli.getAutor()+peli.getTipo()+peli.getAnio());
                break;
                        
            case 4:
                break;
            case 5:
                break;
            case 6:
                //Despedida
                System.out.println("Gracias por haber usado nuestros servicios");
                break;
        }
    }
    
}
