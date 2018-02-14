/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author VP50403
 */
public class FileControl {   
    
    public static void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }       
        public static void escribir(String nombreArchivo, String contenido) {      
                  
        File archivo = new File(nombreArchivo);
        User usuario = new User(); 
        try {                                
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));    
            salida.println(contenido);                        
            salida.close();   
            System.out.println("Se ha escrito correctamente al archivo");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
        public static void anexar(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        User usuario = new User(); 
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);            
            salida.close();
            System.out.println("Se ha anexado información correctamente");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }    
}
