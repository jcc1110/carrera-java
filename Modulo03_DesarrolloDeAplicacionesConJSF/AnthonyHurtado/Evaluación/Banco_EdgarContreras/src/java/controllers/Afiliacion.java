/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import models.AccessData;
import models.User;

/**
 *
 * @author edgar
 */
@Named(value = "afiliacion")
@ApplicationScoped
public class Afiliacion {

    public static List<User> getLstUserAfiliados() {
        return lstUserAfiliados;
    }

    public static void setLstUserAfiliados(List<User> aLstUserAfiliados) {
        lstUserAfiliados = aLstUserAfiliados;
    }

    public static User getU() {
        return u;
    }

    public static void setU(User aU) {
        u = aU;
    }
    private AccessData bd;
    private static List<User> lstUserAfiliados;
    private static User u;
    LoginBean lgb;
    private int tarjeta;
    private int cedula;
    private int monto;
    /**
     * Creates a new instance of Afiliacion
     */
    public Afiliacion() {
        lstUserAfiliados = new ArrayList();
    }
    
    public void ingresar() throws ClassNotFoundException, SQLException{
        lstUserAfiliados = new ArrayList();
        bd = new AccessData();
        u = bd.afiliarUser1(this.tarjeta, this.cedula);
        bd.afiliarUser2(u);
        System.out.println(lstUserAfiliados);
    }
    
    public List<User> mostrarData() throws SQLException, ClassNotFoundException{
        bd = new AccessData();
        lstUserAfiliados = new ArrayList();
        lgb = new LoginBean();
        u = bd.afiliarUser1(this.tarjeta, this.cedula);
        int x = lgb.getId();
        System.out.println(x);
        String sql = "SELECT * FROM afiliados WHERE id_usuario="+x+" ";
        bd.Listar(sql);
        System.out.println(u);
        lstUserAfiliados.add(this.u);
        System.out.println(Afiliacion.lstUserAfiliados);
        return lstUserAfiliados;
    }
    
    public void transferir() throws ClassNotFoundException, SQLException{
        boolean bandera = false;
        bd = new AccessData();
        lgb = new LoginBean();
        u = bd.afiliarUser1(this.tarjeta, this.cedula);
        String sql, sql1, sql2, sql3;
        sql = "UPDATE usuario SET saldo =saldo-"+this.monto+" WHERE id="+lgb.getId()+" ";
        sql1 = "UPDATE usuario SET saldo =saldo+"+this.monto+" WHERE id="+u.getID()+" ";
        sql2 = "INSERT INTO movimiento VALUES("+lgb.getId()+",'Debito',"+this.monto+") WHERE id_usuario="+lgb.getId(); 
        sql3 = "INSERT INTO movimiento VALUES("+u.getID()+",'Credito',"+this.monto+") WHERE id_usuario="+u.getID();
        bd.update(sql);
        bd.update(sql1);
        bd.update(sql2);
        bd.update(sql3);
        bandera=true;
        //return bandera;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
}
