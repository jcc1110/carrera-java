/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 3 de Java
 * @version 1.0
 */
package bean;


import DB.MovimientoBD;
import Modelos.Movimiento;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MovimientoBean {

    private Movimiento movimiento = new Movimiento();
    private List<Movimiento> lstMovimiento;

    public List<Movimiento> getLstMovimiento() {
        return lstMovimiento;
    }

    public void setLstMovimiento(List<Movimiento> lstMovimiento) {
        this.lstMovimiento = lstMovimiento;
    }

    public Movimiento getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    public void registrar() throws Exception {
        
        MovimientoBD BD;
        try {
            BD = new MovimientoBD();
            BD.registrar(movimiento);
        } catch (Exception e) {
            throw e;
        }
    }

    public void listar() throws Exception {
        MovimientoBD BD;
        try {
            BD = new MovimientoBD();
            lstMovimiento = BD.listar();
        } catch (Exception e) {
            throw e;
        }
    }

    public void leerID(Movimiento per) throws Exception {
        MovimientoBD BD;
        Movimiento temp;
        try {
            BD = new MovimientoBD();
            temp = BD.leerID(per);
            if (temp != null) {
                this.movimiento = temp;
            }

        } catch (Exception e) {
            throw e;
        }
    }

  
}
