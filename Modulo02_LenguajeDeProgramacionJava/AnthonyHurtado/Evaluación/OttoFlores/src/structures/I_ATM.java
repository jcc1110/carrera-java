package structures;
import models.User;

public interface I_ATM {
    public boolean validarUsuario(User usuario);
    
    public boolean consultarSaldo(User usuario);
    
    public boolean deposito(User usuario, String deposito);

    public boolean retiro(User usuario, String retiro);

    public boolean cambiarClave(User usuario, String nuevaclave);     
}

