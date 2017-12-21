package herencia;

public class Persona {
    // Atributos de la clase
    private String nombre;
    private String apellido;
    
    // Constructor de la clase
    public Persona() {
        this.nombre = "Anthony";
        this.apellido = "Hurtado";
    }
    
    // Métodos
    public String getNombre() {
        return this.nombre.toUpperCase();
    }
    
    public void setNombre(String _nombre) {
        this.nombre = _nombre.toUpperCase();
    }
    
    public String getApellido() {
        return this.apellido.toUpperCase();
    }
    
    public void setApellido(String _apellido) {
        this.apellido = _apellido.toUpperCase();
    }
    
    public String obtenerNombreCompleto() {
        return (this.nombre +" "+ this.apellido).toUpperCase();
    }
}
