/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author instructor
 */
public class Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Declaración
        File f = new File("/home/instructor/archivos/carrera/Java SE8/murru.txt");
        
        /*try {
            // Crear archivo
            //System.out.println(f.createNewFile());
            
            // Verificar que el archivo exista
            //System.out.println(f.exists());
            
            // Crear directorios (carpetas)
            //System.out.println(f.mkdirs());
        } catch (IOException ex) {
            Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        // Escribir información en archivo
        Writer pw = new FileWriter(f);
        
        pw.write("Hola mundoooooo!");
        pw.append("He modificado el archivo!");
        
        pw.close();
        
        // Leer y mostrar información de un archivo
        FileReader sr = new FileReader(f);
        
        
        while(sr.ready()) {
            System.out.print((char)sr.read());
        }
        System.out.println("");
    }
}