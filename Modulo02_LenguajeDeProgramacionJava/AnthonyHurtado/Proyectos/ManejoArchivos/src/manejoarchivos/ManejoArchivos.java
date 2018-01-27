package manejoarchivos;
import static utileria.Archivos.*;

public class ManejoArchivos {
    public static void main(String[] args) {
        // Ruta del archivo
        String ruta = "RUTA_DEL_ARCHIVO";
        
        // Operaciones con el archivo
        crear(ruta);
        System.out.println("");
        
        escribir(ruta);
        System.out.println("");
        
        leer(ruta);
        System.out.println("");
        
        anexar(ruta);
        System.out.println("");
        
        leer(ruta);
        System.out.println("");
    }
}
