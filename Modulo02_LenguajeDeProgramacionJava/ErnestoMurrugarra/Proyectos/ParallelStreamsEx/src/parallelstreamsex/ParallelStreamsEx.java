/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parallelstreamsex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author instructor
 */
public class ParallelStreamsEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos la lista de números enteros.
        //List<Integer> intNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        
        List<Integer> intNumbers = new ArrayList(10);
        
        // Agregar números aleatoriamente
        Random ran = new Random();
        // Llenando el arreglo
        for(int i = 0; i < intNumbers.size(); i++) {
            intNumbers.add(ran.nextInt());
        }
        
        // Declaramos variables para medir el tiempo que tarda
        long begin = 0, end = 0, result = 0;
        // Tomamos el tiempo inicial
        begin = System.currentTimeMillis();
        // Mostramos los números con el Stream.
        intNumbers.stream().forEach(x -> System.out.println(x));
        end = System.currentTimeMillis();
        System.out.println(end - begin);
        
        System.out.println("");
        
        // Mostramos los números con el ParallelStream.
        begin = 0; end = 0; result = 0;
        begin = System.currentTimeMillis();
        intNumbers.parallelStream().forEach(x -> System.out.println(x));
        end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
    
}
