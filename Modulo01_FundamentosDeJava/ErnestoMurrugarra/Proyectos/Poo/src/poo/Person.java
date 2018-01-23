package poo;

public class Person {
    // Atributos
    // Declaración de atributos
    public String FirstName = null;
    String LastName = null;
    int Ci = 0;
    String Address = "";
    // Atributo constante
    final String LOCATION = "Venezuela";
    
    // Métodos
    /* Creación de un método:
        1.) Modificador de Acceso.
        2.) Tipo de dato que va a retornar
        3.) Nombre.
        4.) Argumentos/Parámetro (OPCIONAL).
    */
    
    Person() {
        System.out.println("Acabo de instanciar un objeto de tipo Person.");
    }
    
    Person(String fn, String ln) {
        this.FirstName = fn;
        this.LastName = ln;
        System.out.println("Acabo de instanciar un objeto de tipo Persona, incluyéndo su nombre completo.");
    }
    
    public void sayHi() {
        System.out.println("Hola! Me llamo " + this.FirstName + " " + this.LastName);
    }
}