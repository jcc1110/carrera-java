/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 3 de Java
 * @version 1.0
 */
package DB;

import Modelos.Movimiento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Metodos asociados a la tabla Movimiento
 * registrar,listar,leer y modificar
 * 
 */

public class MovimientoBD extends BaseDeDatos {
    
   public void registrar(Movimiento mvo) throws Exception {

        try {
             this.Conectar();
             PreparedStatement st = this.getCn().prepareStatement("Insert into movimiento(codigo,Nro_cuenta,monto,Cuenta_Destino,Tipo_Movimiento)value(?,?,?,?,?)");
             st.setInt(1, mvo.getCodigo());
            st.setString(2, mvo.getNro_cuenta());
            st.setDouble(3, mvo.getMonto());
            st.setString(4, mvo.getCuenta_destino());
            st.setString(5, mvo.getTipo_Movimiento());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public List<Movimiento> listar() throws Exception {
        List<Movimiento> lista;
        ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("Select codigo,Nro_cuenta,monto,Cuenta_destino,Tipo_Movimiento from movimiento");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Movimiento mvo = new Movimiento();
                mvo.setCodigo(rs.getInt("codigo"));
                mvo.setNro_cuenta(rs.getString("Nro_cuenta"));
                mvo.setMonto(rs.getDouble("monto"));
                mvo.setCuenta_destino(rs.getString("Cuenta_destino"));
                mvo.setTipo_Movimiento(rs.getString("Tipo_movimiento"));
                lista.add(mvo);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    public Movimiento leerID(Movimiento mvo) throws Exception {
        Movimiento mvos = null;
        ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("Select codigo,nro_cuenta,monto,cuenta_destino,Tipo_Movimiento from bdbancoenlinea.movimiento where codigo=?");
            st.setInt(1, mvo.getCodigo());
            rs = st.executeQuery();
            while (rs.next()) {
                mvos = new Movimiento();
                mvos.setCodigo(rs.getInt("codigo_movimiento"));
                mvos.setNro_cuenta(rs.getString("Nro_cuenta"));
                mvos.setMonto(rs.getDouble("Monto"));
                mvos.setCuenta_destino(rs.getString("Cuenta_destino"));
                mvos.setTipo_Movimiento(rs.getString("Tipo_movimiento"));
              }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return mvos;
    }

   
}
