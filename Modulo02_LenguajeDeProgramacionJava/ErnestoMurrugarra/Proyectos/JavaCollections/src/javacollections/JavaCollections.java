/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author instructor
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Colecciones de tipo Set
        Set<String> lstSet = new HashSet();
        
        // Colecciones de tipo Map
        Map lstMap = new HashMap();
        
        // Set
        // Agregando elementos dinámicamente
        lstSet.add("Softrain");
        lstSet.add("Uneweb");
        lstSet.add("Bellinsoft");
        lstSet.add("Certifikte");
        
        // Muestra de elementos dentro de la lista,
        // sin recorrer.
        System.out.println(lstSet);
        
        // Recorrer lista con foreach (enhanced for)
        for(String s: lstSet) {
            System.out.println(s);
        }
        
        // Recorrer lista con Iterator
        Iterator i = lstSet.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("");
        
        // Helper
        lstSet.stream().sorted().forEach(g -> System.out.println(g));
        System.out.println("");
        lstSet.stream().map(String::toUpperCase).forEach(y -> System.out.println(y));
    
        System.out.println("");
        // Map
        // Agregar elementos
        lstMap.put("name", "Ernesto Alexander");
        lstMap.put("lastName", "Murrugarra Coronel");
        lstMap.put("telf", "(0424)244-5874");
        lstMap.put("address", "Av. Ppal. de la Urb. Blívar.");
        
        System.out.println(lstMap.keySet());
        System.out.println(lstMap.get("address"));
    }
    
}