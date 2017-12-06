package herencia;

public class Herencia {
    public static void main(String[] args) {
        // Clase Persona
        Persona persona = new Persona();                
        persona.setNombre("Jesus");
        System.out.println(persona.getNombre());
        persona.setApellido("Pico");
        System.out.println(persona.getApellido());        
        System.out.println(persona.obtenerNombreCompleto());
        
        // Clase Empleado
        Empleado empleado = new Empleado();
        empleado.setNombre("Ricardo");
        empleado.setApellido("Perez");        
        System.out.println(empleado.setSueldo(50000));        
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getSueldo());
    }
}
