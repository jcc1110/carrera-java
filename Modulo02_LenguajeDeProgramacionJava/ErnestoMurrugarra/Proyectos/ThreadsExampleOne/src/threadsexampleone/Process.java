/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexampleone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Process extends Thread {
    // Atributo
    List<Integer> wordsLst;
    
    // Métodos
    public Process() {
        //this.wordsLst = new ArrayList(10);
        this.wordsLst = Arrays.asList(189,234,344,455,565,676,787,842,990,10098);
    }
    
    public void run() {
        for(int i = 0; i < this.wordsLst.size(); i++) {
            System.out.println(this.getName() + " - " + this.wordsLst.get(i));
        }
        System.out.println();
    }
}