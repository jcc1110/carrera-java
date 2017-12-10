
package ImmerGonzalez;


import java.util.Scanner;


 // @author Immer Gonzalez
 
public class Opciones {
    public void inicioapp(){
   int res;   
    int a;
        System.out.println("1-lista de peliculas disponibles: ");
        System.out.println("2-Buscar Pelicula:");
        System.out.println("3-Agregar una pelicula:");
        System.out.println("4-Modificar los daotos de una pelicula:");
        System.out.println("5-Eliminar una pelicula:");
        System.out.println("/////////////////////////////////////////");
        Scanner sc= new Scanner(System.in);
    
        Base_de_Datos lp=new Base_de_Datos();
        
      
    String operacion=sc.nextLine();
        
                    do{
            switch(operacion){
                case"1":
                    lp.lp();

                   break;
                case"2":
                  System.out.println("Esta funcion se encuentra en mantenimiento");
                  break;
                case"3":
                    System.out.println("Esta funcion se encuentra en mantenimiento");
                   break;
               
                case"4":
                    System.out.println("Esta funcion se encuentra en mantenimiento");
                    break;
                case"5":
                    System.out.println("Esta funcion se encuentra en mantenimiento");
                    break;            
          } 
    System.out.println("Si desea seguir utilzando este servicio tiene que reiniciar el programa.");      
 }while(false); 

                         
    }
     
            
}
