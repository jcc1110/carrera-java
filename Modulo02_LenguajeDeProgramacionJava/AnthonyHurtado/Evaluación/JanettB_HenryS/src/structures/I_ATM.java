package structures;
import models.User;

public interface I_ATM {
    boolean validarUsuario(User usuario);
    String obtenerSaldo(User usuario);
    boolean Retiro(User usuario, String monto);
    boolean Deposito(User usuario, String monto);
    boolean CambioClave(User usuario,String monto);
}
