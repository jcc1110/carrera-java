package estructuras;
import atm.Cliente;
import excepciones.MiATMException;

/**
 * Interfaz para aplicar a los cajeros automáticos.
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public interface ATM {
    /**
     * Método para consulta saldo de la cuenta bancaria.
     * @param cliente Objeto del Cliente actual
     * @return int Dinero disponible
     */
    public abstract int consulta(Cliente cliente);
    
    /**
     * Método para retirar dnero de la cuenta bancaria.
     * @param cliente Objeto del Cliente actual
     * @param _monto int Monto a retirar
     * @return Cliente Objeto actualizado
     * @throws excepciones.MiATMException Error de saldo menor a Bs. 100
     */
    public abstract Cliente retiro(Cliente cliente, int _monto) throws MiATMException;
    
    /**
     * Método para depositar dnero a la cuenta bancaria.
     * @param cliente Objeto del Cliente actual
     * @param _monto int Monto a depositar
     * @return Cliente Objeto actualizado
     */
    public abstract Cliente deposito(Cliente cliente, int _monto);
    
    /**
     * Método para cambiar la clave de ATM de la cuenta bancaria.
     * @param cliente Objeto del Cliente actual
     * @param _clave int hort Nueva clave
     * @return Cliente Objeto actualizado
     * @throws excepciones.MiATMException Error de longitud de la clave menor o mayor a 4
     */
    public abstract Cliente cambiarClave(Cliente cliente, Integer _clave) throws MiATMException;
}
