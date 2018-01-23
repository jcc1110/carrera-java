package manejocolecciones;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ManejoColecciones {
    public static void main(String[] args) {
        // Lista estructurada de datos
        List lista = new ArrayList();
        lista.add("Anthony");
        lista.add("Pepe");
        imprimir(lista);
        
        // Conjunto de datos
        Set conjunto = new HashSet();
        conjunto.add("Perez");
        conjunto.add("Lopez");
        imprimir(conjunto);
        
        // Mapa de clave:valor
        Map mapa = new HashMap();
        mapa.put(1, "anhurtado");
        mapa.put(2, "pepe");
        imprimir(mapa.keySet());
        imprimir(mapa.values());
    }
    
    public static void imprimir(Collection coleccion) {
        for(Object elemento : coleccion) {
            System.out.println(elemento + "");
        }
        System.out.println("");
    }
}
