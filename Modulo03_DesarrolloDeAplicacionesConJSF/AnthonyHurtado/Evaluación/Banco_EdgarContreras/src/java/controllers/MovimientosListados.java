/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.SQLException;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import models.AccessData;
import models.Movimientos;

/**
 *
 * @author edgar
 */
@Named(value = "movimientosListados")
@ApplicationScoped
public class MovimientosListados {
 public MovimientosListados() {
    }
    private AccessData bd;
    private static List<Movimientos> lstMov;
    LoginBean lgb;
    
    public List<Movimientos> mostrarData() throws SQLException, ClassNotFoundException{
        bd = new AccessData();
        lgb = new LoginBean();
        int x = lgb.getId();
        System.out.println(x);
        String sql = "SELECT * FROM movimiento WHERE id_usuario="+x+" ";
        bd.Listar(sql);
        System.out.println(bd.getLstMov());
        return  bd.getLstMov();
    }
    
    
}
