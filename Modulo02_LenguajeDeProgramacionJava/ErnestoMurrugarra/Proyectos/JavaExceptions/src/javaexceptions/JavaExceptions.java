/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author instructor
 */
public class JavaExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte number1 = 0;
        byte number2 = 0;
        int total = 0;
        boolean again = true;
        
        Scanner sc = new Scanner(System.in);
        
        //do {
            try {
                System.out.println("Ingrese el primer número a operar:");
                number1 = sc.nextByte();
                System.out.println("Ingrese el segundo número a operar:");
                number2 = sc.nextByte();
                
                again = false;
            } catch(Exception ex) {
                System.out.println("Ingrese números enteros!!");
                again = true;
            } finally {
                System.out.println("Terminé de verificar las excepciones.");
            }
        //} while(again);
        // Pedimos los números
        
        // Operamos
        total = number1 + number2;
        
        System.out.println("EL total de la suma es: " + total);
    }
}