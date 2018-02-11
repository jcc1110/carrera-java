package controllers;
import model.*;
import structure.I_Val;

public class Controller_I implements I_Val{
    //Intancio AccessData para acceder a sus metodos encapsulados.
    private AccessData bd;
    private int tarjeta, clave;
    
    public Controller_I(){
    }

    @Override
    public boolean ingresoUsuario(User u) { 
        bd = new AccessData();
        return bd.validar(u);//Se llama al metodo validar y se pasa de parametro el objeto usuario
    }
    
    
    /**
     * 
     * @param tarjeta numero de tarjeta
     * @param clave numero de clave
     * @return Retorna el mismo String de el metodo consulta de AccessData
     * pero con esto lo encapsula, y le pasa de parametro el string SQL de la consulta a realizar
     */
    public String Consulta(int tarjeta, int clave) {
        bd = new AccessData();
        String sql = "SELECT saldo FROM usuario WHERE tarjeta=? AND clave=?";
        return bd.consulta(tarjeta, clave, sql);
    }
    
    /**
     * 
     * @param tarjeta numero de tarjeta
     * @param clave numero de clave
     * @param valor el valor del deposito deseado
     */
    public void Deposito(int tarjeta, int clave, int valor) {
        bd = new AccessData();
        String sql = "UPDATE usuario SET saldo=saldo+"+valor+" WHERE tarjeta="+tarjeta+" AND clave="+clave+" ";
        bd.update(tarjeta, clave, sql);
    }
    
    /**
     * 
     * @param tarjeta numero de tarjeta
     * @param clave numero de clave
     * @param valor el valor del retiro deseado
     */
    public void Retiro(int tarjeta, int clave, int valor) {
        bd = new AccessData();                   
        String sql = "UPDATE usuario SET saldo=saldo-"+valor+" WHERE tarjeta="+tarjeta+" AND clave="+clave+" ";
        bd.update(tarjeta, clave, sql);
        
    }
    /**
     * 
     * @param tarjeta numero de tarjeta
     * @param clave numero de clave
     * @param valor la nueva clave a colocar
     */
    public void cambioClave(int tarjeta, int clave, int valor) {
        bd = new AccessData();
        String sql = "UPDATE usuario SET clave="+valor+" WHERE tarjeta="+tarjeta+" AND clave="+clave+" ";
        bd.update(tarjeta, clave, sql);
    }
    
    
    
}
