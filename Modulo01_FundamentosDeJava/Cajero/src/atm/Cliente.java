package atm;

/**
 * Clase Cliente
 * @author Anthony Hurtado
 * @version 1.0
 */
public class Cliente {
    /**
     * Nombre del cliente
     */
    private String nombre;
    
    /**
     * Apellido del cliente
     */
    private String apellido;
    
    /**
     * Tipo de cuenta
     */
    private String tipoCuenta;
    
    /**
     * Numero de cuenta
     */
    private int numeroCuenta;
    
    /**
     * Clave del cajero ATM
     */
    private int clave;
    
    /**
     * Saldo de la cuenta
     */
    private int saldo;
    
    /**
     * Constructor de la clase Cliente
     * @param _nombre Nombre del cliente
     * @param _apellido Apellido del cliente
     * @param _tipoCuenta Tipo de cuenta del cliente
     * @param _numeroCuenta Número de cuenta del cliente
     * @param _clave Clave del cajero ATM
     * @param _saldo Saldo de la cuenta bancaria
     */
    public Cliente(String _nombre, String _apellido, String _tipoCuenta, int _numeroCuenta, int _clave, int _saldo) {
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.tipoCuenta = _tipoCuenta;
        this.numeroCuenta = _numeroCuenta;
        this.clave = _clave;
        this.saldo = _saldo;
    }
    
    public String getNombreCompleto() {
        return this.nombre +" "+ this.apellido;
    }
    
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }
    
    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public int getClave() {
        return this.clave;
    }
    
    public int setClave(int _clave) {
        return this.clave = _clave;
    }

    public int getSaldo() {
        return this.saldo;
    }
    
    public int setSaldo(int _saldo) {
        return this.saldo = _saldo;
    }
}
