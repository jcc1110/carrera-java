package structures;
import models.User;

public interface I_ProcessATM {
    // Validar tarjeta y clave
    public abstract User validate(String card, String password);
    
    // Obtener Balance de Saldo
    public abstract double balance(int idUsuario);
    
    // Realizar un depósito y retiro
    public abstract boolean depositRetirement(int idUsuario, String type, double amount);
    
    // Cambiar la contraseña
    public abstract boolean changePassword(int idUsuario, String newPassword);
}
