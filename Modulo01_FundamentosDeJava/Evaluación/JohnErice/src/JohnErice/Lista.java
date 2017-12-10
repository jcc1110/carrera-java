
package JohnErice;
import java.util.Scanner;

public class Lista {
    
       public void lpeliculas() {
           //opciones del usuario
           System.out.println("=================================================");
           System.out.println("Que pelicula desea elegir:");
           System.out.println("1-Mulan");
           System.out.println("2-Scooby Doo");
           System.out.println("3-Titanic");
           System.out.println("4-Harry Potter");
           System.out.println("5-Pokemon");
           System.out.println("6-Thor");
           System.out.println("7-Iron Man");
           System.out.println("8-Spiderman");
           System.out.println("9-Hulk");
           System.out.println("10-Annabelle");
       System.out.println("==========================");
        Scanner sc= new Scanner(System.in);
         String operacion=sc.nextLine();
         //Condicionales
                    do{
            switch(operacion){
                case"1":
                    System.out.println("Buena opcion has escogido:Mulan");

                   break;
                case"2":
                  System.out.println("Buena opcion has escogido:Scooby doo");
                  break;
                case"3":
                  System.out.println("Buena opcion has escogido:Titanic");
                   break;
               
                case"4":
                    System.out.println("Buena opcion has escogido:Harry potter");
                    break;
                case"5":
                    System.out.println("Buena opcion has escogido:Pokemon");
                    break; 
                case"6":
                    System.out.println("Buena opcion has escogido:Thor");
                    break;      
                case"7":
                    System.out.println("Buena opcion has escogido:Iron Man");
                    break;      
               case"8":
                    System.out.println("Buena opcion has escogido:Spiderman");
                    break;      
                    
               case"9":
                    System.out.println("Buena opcion has escogido:Hulk");
                    break;      
               case"10":
                    System.out.println("Buena opcion has escogido:Annabelle");
                    break;                
          }  
 }while(false); 

           
       }
    
}
