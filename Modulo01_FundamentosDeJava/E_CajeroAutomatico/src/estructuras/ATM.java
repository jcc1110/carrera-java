package estructuras;
import atm.Cliente;
import excepciones.MiExATM;

/**
 * Interfaz para aplicar a los cajeros automáticos.
 * @author Anthony Hurtado
 * @version 1.0
 */
public interface ATM {
    /**
     * Método para consulta saldo de la cuenta bancaria.
     * @return int Dinero disponible
     */
    public abstract int consulta(Cliente cliente);
    
    /**
     * Método para retirar dnero de la cuenta bancaria.
     * @param _monto int Monto a retirar
     * @return boolean Si el dinero se pudo retirar o no
     */
    public abstract Cliente retiro(Cliente cliente, int _monto) throws MiExATM;
    
    /**
     * Método para depositar dnero a la cuenta bancaria.
     * @param _monto int Monto a depositar
     * @return int Dinero depositado
     */
    public abstract Cliente deposito(Cliente cliente, int _monto);
    
    /**
     * Método para cambiar la clave de ATM de la cuenta bancaria.
     * @param _clave int hort Nueva clave
     * @return String Mensaje de éxito o error de la operación
     */
    public abstract Cliente cambiarClave(Cliente cliente, Integer _clave) throws MiExATM;
}
