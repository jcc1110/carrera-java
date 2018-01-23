/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimeexample;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author instructor
 */
public class DateTimeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaración
        LocalDate ld, ld1, ld2;
        // Inicialización
        ld = LocalDate.now();
        ld1 = LocalDate.of(2018, 02, 22);
        ld2 = LocalDate.of(2017,Month.DECEMBER,24);
        
        // Para mostrar las fechas en formato ('YYYY-MM-DD')
        System.out.println(ld);
        System.out.println(ld1);
        System.out.println(ld2);
        
        System.out.println("");
        // Comparaciónes de fechas
        // .isBefore() - Comprobar si una fecha es anterior (Si ya pasó)
        System.out.println(ld.isBefore(ld2));// false
        System.out.println(ld1.isBefore(ld)); //false
        System.out.println(ld.isBefore(ld1)); //true
        
        System.out.println("");
        // .isAfter() - Comprobar si una fecha es superior (Si no ha pasado)
        System.out.println(ld.isAfter(ld2));// true
        System.out.println(ld1.isAfter(ld)); // true
        System.out.println(ld.isAfter(ld1)); // false
        
        // Dando formato a las fechas con LocalDate
        System.out.println(ld.getDayOfMonth() + ", " +
                ld.getMonth() + " del " + ld.getYear());
    }
    
}
