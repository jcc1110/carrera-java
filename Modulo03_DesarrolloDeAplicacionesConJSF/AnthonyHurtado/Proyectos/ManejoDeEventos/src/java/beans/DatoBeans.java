package beans;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ActionEvent;

@Named(value = "db")
@ApplicationScoped
public class DatoBeans implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String nombre;
    
    // Métodos
    public void updateNombre(ActionEvent e) {
        this.setNombre("Anthony");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
