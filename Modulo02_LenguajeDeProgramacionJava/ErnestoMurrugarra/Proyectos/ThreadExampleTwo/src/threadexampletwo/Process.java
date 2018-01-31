/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexampletwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Process implements Runnable {
    // Atributo
    List<Integer> wordsLst;
    
    // Métodos
    public Process() {
        //this.wordsLst = new ArrayList(10);
        this.wordsLst = Arrays.asList(189,234,344,455,565,676,787,842,990,10098);
    }

    @Override
    public void run() {
        for(int i = 0; i < this.wordsLst.size(); i++) {
            try {
                System.out.println(Thread.currentThread().getName()+ " - " + this.wordsLst.get(i));
                
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Process.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println();
    }
    
}