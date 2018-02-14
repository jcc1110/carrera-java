package models;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "saludo")
@ApplicationScoped
public class Saludo {
    
    public Saludo() { }
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String saludar() {
        return "Hola, " + this.getNombre();
    }
}
