/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalizedexceptions;

import com.person.Person;
import com.personexceptions.OriginException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author instructor
 */
public class PersonalizedExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws OriginException {
        Person p = new Person();
        Scanner sc = new Scanner(System.in);
        
        // Pedimos los datos al usuario
        System.out.println("Ingrese el orìgen de la CI:");
        // Mientras se programa
        //p.setOrigin(sc.next().charAt(0));
        
        // Pruebas con usuarios
        try {
            p.setOrigin(sc.next().charAt(0));
        } catch (OriginException ex) {
            System.out.println("Por favor, ingrese un tipo de dato válido.");
        }
    }
    
}
