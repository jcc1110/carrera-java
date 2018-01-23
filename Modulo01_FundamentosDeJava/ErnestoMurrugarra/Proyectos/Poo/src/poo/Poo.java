package poo;

public class Poo {
    public static void main(String[] args) {
        // Declaración de variable de referencia de tipo Person
        Person p = new Person();
        Person p1 = new Person();
        Person p3 = new Person("Juana","López");
        // Si la clase tiene constructor, este se ejecuta en esta línea
        
        p.FirstName = "Ernesto";
        p.LastName = "Murrugarra";
        
        p1.FirstName = "Sheila";
        p1.LastName = "Barreto";
        
        // Ejecutamos el método del objeto
        p.sayHi();
        p1.sayHi();
        p3.sayHi();
    }
}