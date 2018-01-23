package genericos;

public class Genericos {
    public static void main(String[] args) {
        // Tipo entero
        ClaseGenerica<Integer> cg = new ClaseGenerica<>(20);
        cg.obtenerTipo();
        
        // Tipo cadena
        ClaseGenerica<String> cg2 = new ClaseGenerica<>("AH");
        cg2.obtenerTipo();
    }
}
