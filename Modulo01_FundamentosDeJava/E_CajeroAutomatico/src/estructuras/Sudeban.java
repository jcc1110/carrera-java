package estructuras;
import atm.Cliente;
import java.util.ArrayList;

/**
 * Clase padre para establecer lineamientos para los bancos.
 * @author Anthony Hurtado
 * @version 1.0
 */
public abstract class Sudeban {
    /**
     * Nombre del banco.
     */
    protected String nombre;
    
    /**
     * Ubicación fisica del banco.
     */
    protected String ubicacion;
    
    /**
     * Base de datos de clientes.
     */
    public ArrayList<Cliente> bdClientes;
    
    /**
     * Constructor de la clase Sudeban
     * @param _nombreBanco Nombre del nombre
     * @param _ubicacionBanco Ubicación fisica del banco
     */
    public Sudeban(String _nombreBanco, String _ubicacionBanco) {
        this.nombre = _nombreBanco;
        this.ubicacion = _ubicacionBanco;
    }
    
    /**
     * Valida que un cliente exista en la base de datos
     * @param _numeroCuenta Numero de cuenta de cliente proporcionado por el usuario
     * @param _clave Clave del cliente proporcionado por el usuario
     * @return Cliente Cliente encontrado
     */
    public abstract Cliente validarCliente(int _numeroCuenta, int _clave);
}
