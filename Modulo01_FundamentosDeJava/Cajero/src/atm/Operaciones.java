package atm;
import estructuras.ATM;
import excepciones.MiExATM;

/**
 * Clase de operaciones para el ATM.
 * @author Anthony Hurtado
 * @version 1.0
 */
public class Operaciones implements ATM {
    @Override
    public int consulta(Cliente cliente) {
        int saldo = cliente.getSaldo();
        return saldo;
    }

    @Override
    public Cliente retiro(Cliente cliente, int _monto) throws MiExATM {
        int saldo = cliente.getSaldo();
        saldo = saldo - _monto;
        if (saldo < 100) {
            throw new MiExATM("El saldo no puede ser menor Bs. 100");
        }
        cliente.setSaldo(saldo);
        return cliente;
    }

    @Override
    public Cliente deposito(Cliente cliente, int _monto) {
        int saldo = cliente.getSaldo();
        saldo = saldo + _monto;
        cliente.setSaldo(saldo);
        return cliente;
    }

    @Override
    public Cliente cambiarClave(Cliente cliente, Integer _clave) throws MiExATM {
        if (_clave.toString().length() == 4) {
            cliente.setClave(_clave); 
        } else {
            throw new MiExATM("La clave debe contener solo 4 números enteros.");
        }
        return cliente;
    }
}
