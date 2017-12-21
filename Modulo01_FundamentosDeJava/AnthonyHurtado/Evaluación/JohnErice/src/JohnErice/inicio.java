
package JohnErice;


import java.util.Scanner;


 // @author John Erice
 
public class inicio {
    public void inicioapp(){
   int res;   
    int a;
        System.out.println("1-lista de peliculas ");
        System.out.println("2-Buscar palicula");
        System.out.println("3-Agregar pelicula");
        System.out.println("4-Modificar pelicula");
        System.out.println("5-eliminar pelicula");
        System.out.println("==========================");
        Scanner sc= new Scanner(System.in);
    
        Lista Listadepeliculas=new Lista();
        
      
    String operacion=sc.nextLine();
    System.out.println("==========================");
                    do{
            switch(operacion){
                case"1":
                Listadepeliculas.lpeliculas();

                   break;
                case"2":
                  System.out.println("Actualmente esta opcion no se encuentra disponible");
                  break;
                case"3":
                    System.out.println("Actualmente esta opcion no se encuentra disponible");
                   break;
               
                case"4":
                    System.out.println("Actualmente esta opcion no se encuentra disponible");
                    break;
                case"5":
                    System.out.println("Actualmente esta opcion no se encuentra disponible");
                    break;            
          } 
    System.out.println("reinicia el programa");      
 }while(false); 

                         
    }
     
            
}
