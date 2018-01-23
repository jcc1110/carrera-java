/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanagement;

import java.util.Scanner;

/**
 *
 * @author instructor
 */
public class StringManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cadena de caracteres
        String aString = "Carrera Java Programmer";
        
        // Mostramos el string
        System.out.println("Mi string es: " + aString); 
        
        
        StringBuilder aStB = new StringBuilder("Hola soy");
        aStB.append(" Ernesto");
        System.out.println("Mi string es: " + aStB);
        
        // Declaración de Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor Ernesto, ingresa un valor entero: ");
        int userINput = sc.nextInt();
        System.out.println(userINput);
    }
    
}