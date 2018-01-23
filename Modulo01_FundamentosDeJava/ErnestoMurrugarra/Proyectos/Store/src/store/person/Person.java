/**
 * @author Ernesto Murrugarra - Instructor de softrain
 * @version 1.0.0
 */
package store.person;

public abstract class Person {
    //Attr's
    /**Atributo que guarda el nombre de las personas.*/
    protected String Name;
    private char Gender;
    private int Age;
    private String Address;
    
    // Methods
    /**Setea los atributos en su valor por defecto. Para evitar que sean null */
    public Person() {
        this.Name = "";
        this.Gender = '0';
        this.Age = 0;
        this.Address = "";
    }
    
    // Declaración de método abstracto
    /** Método abstracto para mostrar la información del objeto */
    public abstract StringBuilder showInfo();
    /** Método abstracto para pedir la información del objeto */
    public abstract void askInfo();
    
    /** @param n para setear el nombre en el atributo Name.*/
    public void setName(String n) { this.Name = n; }
    /** @param c para setear el género en el atributo Gender.*/
    public void setGender(char c) { this.Gender = c; }
    /** @param a para setear la edad en el atributo Age.*/
    public void setAge(int a) { this.Age = a; }
    /** @param ad para setear ladirección en el atributo Address.*/
    public void setAddress(String ad) { this.Address = ad; }
    
    /**@return EL valor del atributo Name*/
    public String getName() { return this.Name; }
    /**@return EL valor del atributo Gender*/
    public char getGender() { return this.Gender; }
    /**@return EL valor del atributo Age*/
    public int getAge() { return this.Age; }
    /**@return EL valor del atributo Address*/
    public String getAddress() { return this.Address; }
}