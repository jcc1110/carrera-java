/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals;

/**
 *
 * @author instructor
 */
public class Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int a = 5, b = 5;
        
        // Condicional simple
        if(a > b) {
            System.out.println("Se cumplió la condición.");
        }
        
        // Condicional simple con múltiples expresiones
        if((a > b) && ((a > 0) && (b > 0))) {
            System.out.println("Se cumplió la condición de múltiples expresiones.");
        }
        
        // Condicinal doble
        if(a < b) {
            System.out.println("Se cumplió la condición.");
        } else {
            System.out.println("NO se cumplió la condición.");
        }
        
        // Condicional compuesto
        if(a < 0) {
            System.out.println("La variable a es negativa.");
        } else if(a > b) {
            System.out.println("La variable a es mayor que b.");
        } else if(a < b) {
            System.out.println("La variable a es menor que b.");
        } else {
            System.out.println("Ninguna de las anteriores.");
        }
        
        // Estructura de control switch
        byte op = 3;
        char op1 = 'z';
        
        switch(op1) {
            case 'a': case 'z':
                System.out.println("Este es el caso  #1.");
            break;
            
            case 'b':
                System.out.println("Este es el caso  #2.");
            break;
            
            case 'c':
                System.out.println("Este es el caso  #3.");
            break;
            
            default:
                System.out.println("Ninguna de las anteriores.");
            break;
        }
    }
    
}