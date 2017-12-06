package clases;

public abstract class FiguraGeometrica {
    // Atributo: Tipo de Figura
    protected String tipo;
    
    // Constructor de la clase
    public FiguraGeometrica(String _tipo) {
        this.tipo = _tipo;
    }
    
    // Declaración del método que debe ser implementado para la clase hija
    public abstract void dibujar();
    
    // Los demás métodos...
}