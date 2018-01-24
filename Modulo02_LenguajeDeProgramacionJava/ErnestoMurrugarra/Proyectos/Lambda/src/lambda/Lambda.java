/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author instructor
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Referencias
        List<Integer> intLst = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> pairsLst = new ArrayList();
        List<Integer> unpairsLst = new ArrayList();
        
        // Método imperativo
        // Recorremos la lista
        /*for(Integer i : intLst){
            // Verificamos que el número sea par o impar
            if(i % 2 == 0) { // Filtrar los números pares
                pairsLst.add(i);
            } else { // Filtrar los números impares
                unpairsLst.add(i);
            }
        }*/
        
        // Método declarativo (Programación funcional)
        // Filtrar los números pares
        pairsLst = intLst.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        // Filtrar los números impares
        unpairsLst = intLst.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        
        // Mostramos los pares
        for(Integer i : pairsLst){
            System.out.print(i);
        }
        
        System.out.println();
        // Mostramos los pares
        for(Integer i : unpairsLst){
            System.out.print(i);
        }
        
        System.out.println();
        
        // Expresiones lambda con interfaz
        MathOperation addition = (int a,int b) -> a + b;
        MathOperation substraction = (a,b) -> { return a - b; };
        MathOperation mupltiplication = (a,b) -> a * b;
        MathOperation division = (a,b) -> a / b;
        
        System.out.println(operate(5,10, addition));
        System.out.println(operate(5,10, substraction));
        System.out.println(operate(5,10, mupltiplication));
        System.out.println(operate(5,10, division));
    }
    
    // Interfaz para expresión lambda
    interface MathOperation {
        int operation(int a,int b);
    }
    
    // Function
    static int operate (int a, int b, MathOperation mo) {
        return mo.operation(a, b);
    }
}