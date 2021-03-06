package beans;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "ub")
@ApplicationScoped
public class UserBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String usuario;
    private String clave;

    // Métodos
    public String login() {
        return "result";
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
