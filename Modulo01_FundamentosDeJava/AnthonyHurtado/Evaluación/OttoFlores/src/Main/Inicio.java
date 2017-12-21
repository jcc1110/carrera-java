package Main;
import Bussines.*;
import Excepciones.MisExcepciones;
import java.util.*;
/**
 * Punto principal para la Tienda de Peliculas
 * @author Otto Flores
 * @version 1.0.0
 */
public class Inicio {
    /**
     * Método inicial del programa.
     * @param args Argumentos iniciales.
     */
    public static void main(String[] args) {
        // Atributos de la clase
        String tituloPelicula = null;
        String tipoPelicula = null;
        String desPelicula = null;
        int opcion;
        
        // Instancias de Clase        
        Scanner scan = new Scanner(System.in);
        Pelicula pelicula;
        Tienda tienda = new Tienda("Video OTTO", "Caracas - Venezuela");
        Operaciones op = new Operaciones() {};
        
        // Bienvenida a la tienda
        System.out.println("Bienvenido a la tienda " + tienda.getNombreTienda() +" de "+ tienda.getUbicacionTienda());
        
        do {
            // Se imprimen las opciones
            System.out.println("================");
            System.out.println("Opciones:");
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
                {
                    System.out.println("Listar Pleiculas");
                }
                    break;
                case 2:
                    do {            
                    System.out.print("Ingrese el Titulo de la Pelicula: ");
                    tituloPelicula = scan.next();        

                    // Si no encuentra el titulo de la pelicula envia un error
                    pelicula = tienda.validarPelicula(tituloPelicula);
                    if (Objects.isNull(pelicula)) {
                        System.out.println("No existe pelicula con ese titulo");
                                                                         }
                    } while(Objects.isNull(pelicula));

                    System.out.println("Titulo: "+ pelicula.getTituloPelicula());
                    System.out.println("Tipo de pelicula: "+ pelicula.getTipoPelicula());
                    System.out.println("Descripción: "+ pelicula.getDesPelicula());
                    break;
                case 3:
                {
                    System.out.print("Indique el Titulo a agregar: ");
                    tituloPelicula = scan.next();
                    System.out.print("Indique el Tipo de pelicula: ");
                    tipoPelicula = scan.next();
                    System.out.print("Ingrese descripcion de la pelicula: ");
                    desPelicula = scan.next();
                    pelicula = tienda.agregarPelicula(tituloPelicula,tipoPelicula,desPelicula);
                    System.out.println("Inlusión realizada con éxito.");
                }
                    break;
                case 4:
                    do {            
                    System.out.print("Ingrese el Titulo de la Pelicula: ");
                    tituloPelicula = scan.next();        

                    // Si no encuentra el titulo de la pelicula envia un error
                    pelicula = tienda.validarPelicula(tituloPelicula);
                    if (Objects.isNull(pelicula)) {
                        System.out.println("No existe pelicula con ese titulo");
                                                                         }
                    } while(Objects.isNull(pelicula));

                    System.out.println("Titulo: "+ pelicula.getTituloPelicula());
                    System.out.println("Tipo de pelicula: "+ pelicula.getTipoPelicula());
                    System.out.println("Descripción: "+ pelicula.getDesPelicula());
                    System.out.println();
                    System.out.print("Modificar Titulo "+pelicula.getTituloPelicula()+": ");
                    tituloPelicula = scan.next();
                    System.out.print("Modificar Tipo de pelicula"+pelicula.getTipoPelicula()+": ");
                    tipoPelicula = scan.next();
                    System.out.print("Modificar descripcion "+ pelicula.getDesPelicula()+": ");
                    desPelicula = scan.next();
                    pelicula = tienda.modificarPelicula(tituloPelicula,tipoPelicula,desPelicula);
                    System.out.println("Modificación realizada con éxito.");
                    } 
                    break;

            } while(opcion != 6);
        
        // Despedida
        System.out.println("¡Gracias por venir, vuelva pronto");
    } 
}
