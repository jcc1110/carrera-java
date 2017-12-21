package atm;

/**
 * Clase principal de los datos del Cliente
 * @author Anthony Hurtado
 * @version 1.0.0
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
     * Constructor de la clase Cliente inicializando los valores.
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
    
    /**
     * Obtener el nombre completo del cliente.
     * @return String Nombre completo del cliente.
     */
    public String getNombreCompleto() {
        return this.nombre +" "+ this.apellido;
    }
    
    /**
     * Obtener el número del cuenta del cliente.
     * @return int Número de cuenta del cliente.
     */
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }
    
    /**
     * Obtener el tipo de cuenta del cliente.
     * @return String Tipo de cuenta del cliente.
     */
    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    /**
     * Obtener la clave del cliente.
     * @return int Clave del cliente.
     */
    public int getClave() {
        return this.clave;
    }
    
    /**
     * Obtener el saldo del cliente.
     * @return int saldo del cliente
     */
    public int getSaldo() {
        return this.saldo;
    }
    
    /**
     * Establecer la clave del cliente.
     * @param _clave Nueva clave del cliente
     * @return int Nueva clave del cliente
     */
    public int setClave(int _clave) {
        return this.clave = _clave;
    }
    
    /**
     * Establecer saldo del cliente.
     * @param _saldo Nuevo saldo del cliente
     * @return int Nuevo Saldo del cliente
     */
    public int setSaldo(int _saldo) {
        return this.saldo = _saldo;
    }
}
