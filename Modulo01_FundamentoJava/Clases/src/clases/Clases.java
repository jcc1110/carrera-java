package clases;

public class Clases {
    public static void main(String[] args) {
        // Declarado la variable
        String nombreEdificio;
                
        // Instancio la clase Edicio
        Edificio uno = new Edificio("");
        nombreEdificio = "EDIFICIO " + uno.obtenerNombre(false);
        
        // Establezco el valor del atributo anio_construido
        uno.anio_construido = 2000;
        
        // Muestro los valores
        System.out.println("El nombre es: " + nombreEdificio);
        System.out.println("Esta ubicado en: " + uno.ubicacion_estado);
        System.out.println("La antiguedad es: " + uno.obtenerAntiguedad() + " años");
        System.out.println("La cantidad de aptos son: " + uno.obtenerCantAptos());    
    }
}
