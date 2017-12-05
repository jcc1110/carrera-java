package excepciones;

public class Division {
    // Atributos
    private int numerador;
    private int denominador;
    
    // Declaro mi constructor
    public Division(int _numerador, int _denominador) {
        this.numerador = _numerador;
        this.denominador = _denominador;
    }
    
    // Método para dividir dos números
    public void dividir() throws MiExcepcion {
        int resultado;     
        
        if (this.denominador == 0) {
            throw new MiExcepcion("La división no puede ser realizada con un valor cero.");
        }
        
        resultado = this.numerador / this.denominador;
        System.out.println("El resultado es: "+ resultado);
    }
}
