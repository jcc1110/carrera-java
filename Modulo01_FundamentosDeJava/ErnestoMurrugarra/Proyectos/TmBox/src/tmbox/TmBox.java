/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmbox;

import java.util.Scanner;

/**
 *
 * @author instructor
 */
public class TmBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            1.) Declarar una variable acumulativa.
            2.) Emular el funcionamiento de un cajero automático.
            3.) Debe permitir un total de 3 intentos, incluyendo el mensaje
                de aviso al usuario.
            4.) En caso de haber ingresado la contraseña errada 3 veces,
                indicar que fue bloqueado. De lo contrario, mostrar el mensaje
                de bienvenido al sistema.
        */
        // Variable acumulativa.
        int tries = 0;
        // Variable para guardar la clave correcta;
        final String CORRECT_PSK = "1234";
        // Variable para guardar la clave ingresada por el usuario;
        String userPsk = "";
        // Variable para indicar si debe o no seguir en el ciclo
        boolean correct = false;
        // Variable de referencia Scanner (instancia de objeto)
        Scanner sc = new Scanner(System.in);
        
        do {
            // Pedimos al usuario que ingrese su contraseña para ingresar al sistema.
            System.out.print("Ingrese su clave: ");
            userPsk = sc.next();
            // Comparamos las cadenas de caracteres.
            if(userPsk.equals(CORRECT_PSK)) {
                // Indicamos que el proceso de autenticación fue exitoso.
                correct = true;
                System.out.println("Bienvenido al sistema.");
            } else {
                tries++;
                if (tries == 3) {
                    System.out.println("USTED HA SIDO BLOQUEADO.");
                    correct = true;
                } else {
                    System.out.println("Ha ingresado la clave errada " +tries+ "vez.");
                    System.out.println("AL TERCER INTENTO SERÁ BLOQUEADO.");
                }
            }
        } while(!correct);
    }
    
}
