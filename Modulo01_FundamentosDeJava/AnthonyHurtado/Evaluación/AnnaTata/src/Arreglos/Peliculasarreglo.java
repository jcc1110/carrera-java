/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;
import java.util.ArrayList;

public class Peliculasarreglo {
    public static void main(String[] args) {
        
        // Segunda forma de declarar un arreglo, valor entre corchetes es la longitud que tendrá el arreglo
        String[] nombrepelicula = new String[10];
        nombrepelicula[0] = "Naufrago";
        nombrepelicula[1] = "Ray";
        nombrepelicula[2] = "Armagedon";
        nombrepelicula[3] = "Creed";
        nombrepelicula[4] = "Joy";
        nombrepelicula[5] = "Pasajeros";
        nombrepelicula[6] = "Pixeles";
        nombrepelicula[7] = "Forrest";
        nombrepelicula[8] = "Batman";
        nombrepelicula[9] = "Ronaldo";
        
        // Instancia mi clase ArrayList
        ArrayList<String> arreglo = new ArrayList<>();
        
        
        // Mostrando los valores
        // Aplico una estructra iterativa "For"
        for (int i=0; i<=9; i++) {

        System.out.println(nombrepelicula[i]); 
        
        }
    }
}