/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agecalculate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author instructor
 */
public class AgeCalculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables enteras
        Scanner sc = new Scanner(System.in);
        int d, m, a, age;
        LocalDate birthDate, today;
        
        // Pedimos la información al usuario
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Día: ");
        d = sc.nextInt();
        System.out.print("Mes: ");
        m = sc.nextInt();
        System.out.print("Año: ");
        a = sc.nextInt();
        
        // Creamos la fecha actual
        today = LocalDate.now();
        
        // Creamos el objeto LocalDate
        birthDate = LocalDate.of(a, m, d);
        
        // Obtengo la diferencia de años entre hoy y la fecha ingresada
        age = today.getYear() - birthDate.getYear();
        
        // Comparamos el mes de nacimiento con el actual
        if(!today.isBefore(birthDate)) {
            age--;
        }
        
        // Mostramos la edad de la persona
        System.out.println(age);
    }
    
}