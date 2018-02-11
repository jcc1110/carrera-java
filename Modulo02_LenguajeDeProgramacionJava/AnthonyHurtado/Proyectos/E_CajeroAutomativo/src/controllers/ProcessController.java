package controllers;
import models.DataAccess;
import models.User;
import structures.I_ProcessATM;

public class ProcessController implements I_ProcessATM {
    // Atributos
    DataAccess da;
    
    // Métodos
    public ProcessController() {
        this.da = new DataAccess();
    }
    
    @Override
    public User validate(String card, String password) {
        return this.da.validateUser(card, password);
    }

    @Override
    public double balance(int idUser) {
        return this.da.balanceUser(idUser);
    }

    @Override
    public boolean depositRetirement(int idUsuario, String type, double amount) {
        return this.da.depositRetirementUser(idUsuario, type, amount);
    }

    @Override
    public boolean changePassword(int idUsuario, String newPassword) {
        return this.da.changePassUser(idUsuario, newPassword);
    }
}
