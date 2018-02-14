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
    @Override
    public boolean consultarSaldo(User usuario) {
        DataAccess bd = new DataAccess();
        return bd.consultar(usuario);
    }
    @Override
    public boolean deposito(User usuario, String deposito) {
        DataAccess bd = new DataAccess();
        return bd.depositar(usuario, deposito);   
    }
    @Override
    public boolean retiro(User usuario, String retiro) {
        DataAccess bd = new DataAccess();
        return bd.retirar(usuario, retiro);   
    }    
    @Override
    public boolean cambiarClave(User usuario, String nuevaclave) {
        DataAccess bd = new DataAccess();
        return bd.cambiar(usuario, nuevaclave);   
    }      
}