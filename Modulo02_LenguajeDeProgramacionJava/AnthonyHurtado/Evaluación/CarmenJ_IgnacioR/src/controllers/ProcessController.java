package controllers;
import models.DataAccess;
import models.User;
import structures.I_ATM;

public class ProcessController implements I_ATM {
    @Override
    public boolean validarUsuario(User usuario) {
        DataAccess bd = new DataAccess();
        return bd.validar(usuario);        
    }
}
