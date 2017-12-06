package clasesabstractas;
import clases.FiguraGeometrica;
import clases.Circulo;

public class ClasesAbstractas {
    public static void main(String[] args) {
        // Instanciando la clase Circulo como FiguraGeometrica
        FiguraGeometrica fg = new Circulo("Circulo");
        
        // Llamando al método dibujar
        fg.dibujar();
    }
}
