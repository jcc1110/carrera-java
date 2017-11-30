package clases;

// Extendiendo de la clase abstracta FiguraGeometricas
public class Circulo extends FiguraGeometrica {
    // Constructor de la clase
    public Circulo(String _tipo) {
        super(_tipo);
    }

    // Método heredado de FiguraGeometrica a implementar
    @Override
    public void dibujar() {
        // Mostrando el nombre de la clase
        System.out.println("Dibujo un: " + this.getClass().getSimpleName());
    }
}
