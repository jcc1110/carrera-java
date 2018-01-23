/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author instructor
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String fullName = "", zodiac = "";
        StringBuilder data; // Creando la variable de referencia
        data = new StringBuilder(); // Instanciando (creando el objeto)
        int age = 0;
        float high = 0F, weight = 0F, imc = 0F;
        
        // Referencias
        Scanner sc = new Scanner(System.in);
        
        // Pedir los datos al usuario final
        System.out.println("Por favor ingrese los siguientes datos:");
        System.out.print("Nombre completo: ");
        fullName = sc.nextLine();
        System.out.println("Edad: ");
        age = sc.nextInt();
        System.out.print("\nSigno zodiacal: ");
        zodiac = sc.next();
        System.out.print("Estatura (Mts): ");
        high = sc.nextFloat();
        System.out.print("Peso (Kg): ");// < 18.5 bajopeso, 18.5-24.9 adecuado, 29.9 sob
        weight = sc.nextFloat();
        
        // Calcular IM
        imc = weight / ((float) (Math.pow(high, 2)));
        
        // Creamos la cadena con la ficha de la persona
        data.append("\n\nDatos de ").append(fullName);
        data.append("\nEdad: ").append(age).append("\nSigno: ").append(zodiac);
        data.append("\nEstatura: ").append(high).append("\nPeso: ").append(weight);
        data.append("\nEl IMC de esta persona es: ").append(imc);
        
        // Mostramos en pantalla
        System.out.println(data);
    }
    
}
