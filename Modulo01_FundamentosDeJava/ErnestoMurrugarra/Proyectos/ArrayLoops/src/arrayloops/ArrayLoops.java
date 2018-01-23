/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayloops;

import java.util.Scanner;

/**
 *
 * @author instructor
 */
public class ArrayLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar el vector
        int[] anArray = new int[5];
        // Referencia a clase Scanner
        Scanner sc = new Scanner(System.in);
        
        // Ciclo for para recorrer el vector
        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Ingrese el valor de la posición #" + (i + 1) + ": ");
            anArray[i] = sc.nextInt();
        }
        
        // Mostramos los datos
        for (int i = 0; i < anArray.length; i++) {
            System.out.println("El valor de la posición #" + (i + 1) + " es : " + anArray[i]);
        }
    }
    
}
