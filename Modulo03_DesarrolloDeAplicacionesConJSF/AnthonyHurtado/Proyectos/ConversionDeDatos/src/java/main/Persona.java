package main;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "persona")
@RequestScoped
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String fecha;
    private String url;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
