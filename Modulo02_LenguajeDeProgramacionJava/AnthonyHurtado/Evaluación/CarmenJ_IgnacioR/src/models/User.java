package models;

public class User {
    private int id;
    private String tarjeta;
    private String clave;
    private String saldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
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
