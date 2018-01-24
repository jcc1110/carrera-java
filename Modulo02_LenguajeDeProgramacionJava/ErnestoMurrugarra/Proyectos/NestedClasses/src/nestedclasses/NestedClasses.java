/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclasses;

import com.classes.External;
import com.classes.External.InnerNonStaticMemberClass;

/**
 *
 * @author instructor
 */
public class NestedClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Referencias
        External ex = new External();
        External.InnerNonStaticMemberClass insmc = ex.new InnerNonStaticMemberClass();
                
        // Muestra de datos con clase interna estática
        External.InnerStatic.innMethodOne();
        
        // Clase interna no estática de método
        ex.getInnerValue();
        
        ex.methodOne();
    }
    
}
