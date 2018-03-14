package structure;
import entities.Afiliacion;
import entities.Usuario;

public interface I_ATM {
    Usuario validarUsuario(Usuario usuario) throws MyExceptions;
    String obtenerSaldo(Usuario usuario);
    boolean Retiro(Usuario usuario, String monto);
    boolean Deposito(Usuario usuario, String monto);
    boolean CambioClave(Usuario usuario,String monto);
    public abstract boolean AddAccount(Usuario _usuario, String ctaTipo, String nroCuenta, String banco, String nombre) throws MyExceptions;    
    public abstract boolean ChangeData(Usuario _usuario, String _usr_Cedula, String nombre) throws MyExceptions;
    public Afiliacion ConsultarNroCuenta(Afiliacion afiliacion) throws MyExceptions;
}
