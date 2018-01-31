/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexampleone;

/**
 *
 * @author instructor
 */
public class ThreadsExampleOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancias
        Process p = new Process();
        Process p1 = new Process();
        Process p2 = new Process();
        
        p.start();
        p1.start();
        p2.start();
    }
}