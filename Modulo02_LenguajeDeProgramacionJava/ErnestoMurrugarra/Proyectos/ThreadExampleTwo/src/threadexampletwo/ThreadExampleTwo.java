/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexampletwo;

/**
 *
 * @author instructor
 */
public class ThreadExampleTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancias
        Process p = new Process();
        Process p1 = new Process();
        Process p2 = new Process();
        
        // Definimos los hilos
        Thread t1 = new Thread(p, "Hilo 1");
        Thread t2 = new Thread(p1, "Hilo 2");
        Thread t3 = new Thread(p2, "Hilo 3");
        
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Este es el 4to hilo " + Thread.currentThread().getName());
            }
            
        });
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        System.out.println("FIN DEL PROGRAMA.");
    }
    
}
