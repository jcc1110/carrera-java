/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;

/**
 *
 * @author instructor
 */
public class JavaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaración de arreglos
        // Unidimensionales (Vectores)
        int[] intArray;
        
        // Inicialización de arreglos
        // Unidimensionales (Vectores)
        intArray = new int[3]; // de la posición 0 hasta la 2
        
        // Declaración e Inicialización de arreglos
        String[] stringArray = {"Juan", "Luisa", "Marcos"};
        
        // Guardar valores a un arreglo
        // Manual
        intArray[0] = 5000;
        intArray[1] = 1000;
        intArray[2] = -9230;
        
        // Mostrar valores de un arreglo
        // Manual
        System.out.println("Posición #1: " + intArray[0]);
        System.out.println("Posición #2: " + intArray[1]);
        System.out.println("Posición #3: " + intArray[2]);
        
        System.out.println("\n\nPosición #1: " + stringArray[0]);
        System.out.println("Posición #2: " + stringArray[1]);
        System.out.println("Posición #3: " + stringArray[2]);
        
        System.out.println("\n\nPosición #1: " + stringArray[0] + " - " + intArray[0]);
        System.out.println("Posición #2: " + stringArray[1] + " - " + intArray[1]);
        System.out.println("Posición #3: " + stringArray[2] + " - " + intArray[2]);
    }
    
}
