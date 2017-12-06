package atm;
import estructuras.Sudeban;
import java.util.ArrayList;

/**
 * Clase de gestión del banco y cuenta bancaria.
 * @author Anthony Hurtado
 * @version 1.0.0
 * @see Sudeban Herencia para aplicar las regulaciones al banco
 */
public class Banco extends Sudeban {
    /**
     * Constructor de la clase Sudeban y Banco inicializando la lista de clientes.
     * @param _nombreBanco Nombre del banco actual
     * @param _ubicacionBanco Dirección del banco actual
     */
    public Banco(String _nombreBanco, String _ubicacionBanco) {
        super(_nombreBanco, _ubicacionBanco);
        super.bdClientes = new ArrayList<>();
        super.bdClientes.add(new Cliente("Anthony","Hurtado","Corriente",111111,1234,1000));
        super.bdClientes.add(new Cliente("Franklin","Duran","Ahorro",222222,1234,1000));
        super.bdClientes.add(new Cliente("Mirna","Pico","Corriente",333333,1234,1000));
    }

    @Override
    public Cliente validarCliente(int _numeroCuenta, int _clave) {
        Cliente cliente = null;        
        for (Cliente cli : this.bdClientes) {
            if (cli.getNumeroCuenta() == _numeroCuenta && cli.getClave() == _clave) {
                cliente = cli;
            }
        }
        return cliente;
    }
    
    /**
     * Obtener el nombre del banco.
     * @return String Nombre del banco
     */
    public String getNombre() {
        return super.nombre;
    }
    
    /**
     * Obtener la ubicación del banco.
     * @return String Ubicación del banco
     */
    public String getUbicacion() {
        return super.ubicacion;
    }
}
