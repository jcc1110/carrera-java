/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrlst;

import java.util.ArrayList;

/**
 *
 * @author instructor
 */
public class ArrLst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración e inicialización
        ArrayList<Object> intArrLst = new ArrayList<Object>();
        
        // Agregar elementos al ArrayList
        intArrLst.add(1200);
        intArrLst.add(-6558);
        intArrLst.add(-899878);
        intArrLst.add(1021225);
        intArrLst.add("999878");
        
        // Mostrar los valores
        System.out.println(intArrLst.get(4));        
    }   
}