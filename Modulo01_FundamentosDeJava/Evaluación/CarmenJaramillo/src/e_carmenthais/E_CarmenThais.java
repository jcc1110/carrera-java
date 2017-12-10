/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_carmenthais;

import Complemento.Gerentes;
import Complemento.Operaciones;
import Complemento.Peliculas;
import Complemento.Tienda001;
import Excepciones.MisExcepciones;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author vp50403
 */
public class E_CarmenThais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MisExcepciones {
        // TODO code application logic here
        int numced;
        int codgte;
        int codPelicula;
        int opcion;
        String titulo = null;
        String genero = null;
        char clase;
        int anio;
        
        
        // Instancias de Clase        
        Scanner scan = new Scanner(System.in);
        Gerentes gerente;           
        Peliculas iCodigo = null;
        Tienda001 miTienda;
        miTienda = new Tienda001(0101, "Tu Tienda 905", "Cota 905");
        Operaciones opera = new Operaciones();
        
        // Bienvenida del ATM
        System.out.println("/*****************/");
        System.out.println("***AUTENTICACION***");
        System.out.println("/*****************/");
        do {            
            System.out.print("Ingrese su CÉDULA: ");
            numced = scan.nextInt();  
            System.out.print("Ingrese su CÓDIGO: ");
            codgte = scan.nextInt();  
 
            // Si no encuentra al GERENTE envio un error
            gerente = miTienda.validarGerente(numced, codgte);
            if (Objects.isNull(gerente)) {
                System.out.println("Su identificacion no es Correcta");
                System.out.println("Intente nuevamente");
            }
        } while(Objects.isNull(gerente));
        
        // Bienvenida al GERENTE
        System.out.println("*******************");
        System.out.println("Buen día, "+ gerente.getNombre() + "¡");
        System.out.println("Bienvenido a " + miTienda.getNombre() + " de " + miTienda.getUbicacion());
        
        do {
            // Mostrar Opciones de Trabajo
            System.out.println("**********************");
            System.out.println("Películas:");
            System.out.println("1 - Consultar ");
            System.out.println("2 - Agregar ");
            System.out.println("3 - Modificar ");
            System.out.println("4 - Eliminar ");
            System.out.println("5 - Listado");
            System.out.println("6 - Salir");
            System.out.print("Opción: ");
            opcion = scan.nextInt();
            
            // Validar opcion seleccionada
            switch (opcion) {
            // Consulta si la película existe    
                case 1:                   
                //    Peliculas iCodigo;
                  do { 
                    System.out.println("Indique código: ");
                    codPelicula = scan.nextInt();  
                    iCodigo = miTienda.validarPelicula(codPelicula);    
                    if (Objects.isNull(iCodigo)) {
                        System.out.println("La Película No Existe. ");
                        System.out.println("Intente nuevamente");
                        }
                    else {
                        System.out.println("La película consultada es: " 
                            + iCodigo.getTitulo() + " " + iCodigo.getGenero() + " " +
                            + iCodigo.getClase() + " " + iCodigo.getAnio());     
                    }
                    } while(Objects.isNull(iCodigo));            
                    break;
            // Agrega nueva película
                case 2:
                    miTienda.bdPeliculas = new ArrayList<>();
                    System.out.println("Indique código: ");
                    codPelicula = scan.nextInt();  
                    System.out.println("Escriba Título: ");
                    titulo = scan.next(titulo);  
                    System.out.println("Escriba Género: ");
                    genero = scan.next(genero); 
                    System.out.println("Escriba Clase: ");                    
                    clase = (char) scan.nextInt();        
                    System.out.println("Escriba Año: ");
                    anio = scan.nextInt();                    
                    miTienda.bdPeliculas.add(new Peliculas(codPelicula,titulo,genero,clase,anio,true));
                    break;
            // Modifica Año de la película
                case 3:                                        
                    System.out.println("Indique código: ");
                    codPelicula = scan.nextInt();
                    System.out.println("Indique año: ");
                    anio = scan.nextInt();
                    iCodigo = opera.modificar(iCodigo, anio);
                    System.out.println("Se ha realizado el cambio " + iCodigo.getAnio());
                    break;
            // Da de baja la película cambiando el estado
                case 4:                    
                    System.out.print("Opción 4 ");
                    break;
            // Genera listado de las películas existentes
                case 5:
                    System.out.print("Opción 5 ");
                    break;
            }
        } while(opcion != 6);
        
        
        System.out.println("Hasta luego, " + gerente.getNombre() + "¡¡¡");
        System.out.println("*******************");   
                
    }
    
}
