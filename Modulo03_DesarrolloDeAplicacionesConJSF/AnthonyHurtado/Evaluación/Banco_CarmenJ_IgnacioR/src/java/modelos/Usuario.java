package modelos;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "usuario")
@ApplicationScoped

public class Usuario {
    private int id;
    private String cuenta;
    private String clave;
    private String saldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}
