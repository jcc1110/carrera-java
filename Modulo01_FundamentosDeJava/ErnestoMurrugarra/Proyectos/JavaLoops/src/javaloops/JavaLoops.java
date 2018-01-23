/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloops;

/**
 *
 * @author instructor
 */
public class JavaLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ciclo While
        int tries = 7;
        
        while(tries < 3) { // La evaluación de la condición debe ser verdadera
            System.out.println("Se cumplió la condición, por ende entró al ciclo.");
            tries++;
        }
        
        // Ciclo DoWhile
        do {
            System.out.println("Se cumplió la condición, por ende entró al ciclo.");
            tries++;
        }while(tries < 6);
        
        // Ciclo For
            // Declaración de un acumulador
            // Evaluación
            // Acumular/Contar
        for(int j = 0; j < 5; j++) {
            System.out.println("Iteración #" + (j + 1));
        }
        
    }
    
}
