/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 3 de Java
 * @version 1.0
 */
package bean;

import DB.CuentaBD;
import Modelos.Cuenta;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CuentaBean {

    private Cuenta cuenta = new Cuenta();
    private List<Cuenta> lstCuenta;

    public List<Cuenta> getLstCuenta() {
        return lstCuenta;
    }

    public void setLstCuenta(List<Cuenta> lstCuenta) {
        this.lstCuenta = lstCuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void registrar() throws Exception {

        CuentaBD BD;
        try {
            BD = new CuentaBD();
            BD.registrar(cuenta);
        } catch (Exception e) {
            throw e;
        }
    }

    public void listar() throws Exception {
        CuentaBD BD;
        try {
            BD = new CuentaBD();
            lstCuenta = BD.listar();
        } catch (Exception e) {
            throw e;
        }
    }

    public void leerID(Cuenta per) throws Exception {
        CuentaBD BD;
        Cuenta temp;
        try {
            BD = new CuentaBD();
            temp = BD.leerID(per);
            if (temp != null) {
                this.cuenta = temp;
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificar() throws Exception {
        CuentaBD BD;
        try {
            BD = new CuentaBD();
            BD.modificar(cuenta);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminar() throws Exception {
        CuentaBD BD;
        try {
            BD = new CuentaBD();
            BD.eliminar(cuenta); 
        } catch (Exception e) {
            throw e;
        }
    }

}
