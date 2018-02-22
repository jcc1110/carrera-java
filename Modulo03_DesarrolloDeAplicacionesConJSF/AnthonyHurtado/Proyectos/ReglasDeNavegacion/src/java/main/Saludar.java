package main;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "saludar")
@ApplicationScoped
public class Saludar {
    private String nombre;
    
    public String hola() {
        String pagina;
        
        if (this.getNombre().isEmpty()) {
            pagina = "error";
        } else {
            pagina = "page3";
        }
        
        return pagina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
