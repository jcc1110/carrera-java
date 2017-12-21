package clases;

public class Edificio {
    // Atributos: No inicializados   
    int cant_aptos;
    int antiguedad;
    
    // Atributos: Inicializados
    int cant_pisos;
    int anio_construido;
    private String nombre;
    String ubicacion_estado;    
    boolean tiene_salon_fiesta;
    boolean tiene_maletero;
    boolean tiene_ascensor;
    boolean tiene_piscina;
    boolean tiene_estacionamiento;
    
    // Constructor de la clases
    public Edificio() {
        // Inicializando los atributos de mi clase
        this.cant_pisos = 4;
        this.anio_construido = 1950;
        this.nombre = "Java";
        this.ubicacion_estado = "Chacao";
        this.tiene_ascensor = true;
        this.tiene_maletero = false;
        this.tiene_estacionamiento = true;
        this.tiene_piscina = false;
    }
    
    // Segundo constructor de la clases con un parametro 
    public Edificio(String _nombre) {
        this.nombre = (_nombre.isEmpty()) ? "Java Tunning" : _nombre;
    }
    
    public int obtenerAntiguedad() {
        // Variable para resultado
        int resultado = 0;
        
        // Operamos
        this.antiguedad = 2017 - this.anio_construido;
        resultado = this.antiguedad;
        
        // Retornamos el valor
        return resultado;
    }
    
    public int obtenerCantAptos() {
        // Variable para resultado
        int resultado = 0;
        
        // Operamos
        this.cant_aptos = this.cant_pisos * 4;
        resultado = this.cant_aptos;
        
        // Retornamos el valor
        return resultado;        
    }
    
    public String obtenerNombre(boolean retornarMayus) {
        // Declaro una varible
        String nombre;
        
        // Pregunto por mi parametro
        if (retornarMayus) {
            nombre = this.nombre.toUpperCase();
        } else {
            nombre = this.nombre.toLowerCase();
        }
        
        // Retornamos el valor
        return nombre;
    }
}
