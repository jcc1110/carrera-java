
package ImmerGonzalez;
import java.util.Scanner;

public class Base_de_Datos {
    
       public void lp() {
           //opciones del usuario
           System.out.println("/////////////////////////////");
           System.out.println("Que pelicula desea elegir:");
           System.out.println("1- Casa Blanca.");
           System.out.println("2- Los Cazafantasmas.");
           System.out.println("3- Titanic");
           System.out.println("4- Rocky.");
           System.out.println("5- Indiana Jones.");
           System.out.println("6- Terremoto.");
           System.out.println("7- Tiburon.");
           System.out.println("8- Piranha.");
           System.out.println("9- Liberen a Willy");
           System.out.println("10- Freddy Krouger.");
       System.out.println("++++++++++++++++++++++++++++++++++");
        Scanner sc= new Scanner(System.in);
         String operacion=sc.nextLine();
         //Condicionales
                    do{
            switch(operacion){
                case"1":
                    System.out.println("Excelente eleccion, has escogido: Casa Blanca.");

                   break;
                case"2":
                  System.out.println("Excelente eleccion, has escogido: Los Cazafantasmas.");
                  break;
                case"3":
                  System.out.println("Excelente eleccion, has escogido: Titanic.");
                   break;
               
                case"4":
                    System.out.println("Excelente eleccion, has escogido: Rocky.");
                    break;
                case"5":
                    System.out.println("Excelente eleccion, has escogido: Indiana Jones.");
                    break; 
                case"6":
                    System.out.println("Excelente eleccion, has escogido: Terremoto.");
                    break;      
                case"7":
                    System.out.println("Excelente eleccion, has escogido: Tiburon.");
                    break;      
               case"8":
                    System.out.println("Excelente eleccion, has escogido: Piranha.");
                    break;      
                    
               case"9":
                    System.out.println("Excelente eleccion, has escogido: Liberen a Willy.");
                    break;      
               case"10":
                    System.out.println("Excelente eleccion, has escogido: Freddy Krouger.");
                    break;                
          }  
 }while(false); 

           
       }
    
}
