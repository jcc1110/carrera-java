/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 3 de Java
 * @version 1.0
 */
package DB;
/**
 *
 * Metodos asociados a la tabla Cuenta
 * registrar,listar,leer y modificar
 * 
 */
import Modelos.Cuenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CuentaBD extends BaseDeDatos {

   public void registrar(Cuenta cta) throws Exception {

        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("Insert into cuenta(codigo,Nro_cuenta,Saldo,Tipo_cuenta)value(?,?,?,?)");
            st.setInt(1, cta.getCodigo());
            st.setString(2, cta.getNro_cuenta());
            st.setDouble(3, cta.getSaldo());
            st.setString(4, cta.getTipo_cuenta());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public List<Cuenta> listar() throws Exception {
        List<Cuenta> lista;
        ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("Select codigo,Nro_cuenta,Saldo,Tipo_cuenta) from cuenta");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Cuenta cta = new Cuenta();
                cta.setCodigo_cuenta(rs.getInt("codigo"));
                cta.setNro_cuenta(rs.getString("Nro_cuenta"));
                cta.setSaldo(rs.getDouble("Saldo"));
                cta.setTipo_cuenta(rs.getString("Tipo_Cuenta"));
                lista.add(cta);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    public Cuenta leerID(Cuenta cta) throws Exception {
        Cuenta ctas = null;
        ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("Select codigo,Nro_cuenta,Saldo,Tipo_cuenta from cuenta where codigo=?");
            st.setInt(1, cta.getCodigo());
            rs = st.executeQuery();
            while (rs.next()) {
                ctas = new Cuenta();
                ctas.setCodigo_cuenta(rs.getInt("codigo_cuenta"));
                ctas.setNro_cuenta(rs.getString("Nro_cuenta"));
                ctas.setSaldo(rs.getDouble("Saldo"));
                ctas.setTipo_cuenta(rs.getString("Tipo_cuenta"));
              }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return ctas;
    }

    public Cuenta modificar(Cuenta cta) throws Exception {
        Cuenta ctas = null;
        ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE cuenta set codigo=?,Nro_cuenta=?,Saldo=?,Tipo_cuenta=? where codigo=?");
            st.setInt(1, cta.getCodigo());
            st.setString(2, cta.getNro_cuenta());
            st.setDouble(3, cta.getSaldo());
            st.setString(4, cta.getTipo_cuenta());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return ctas;
    }

   public Cuenta eliminar(Cuenta cta) throws Exception {
        Cuenta ctas = null;
        ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("Delete cuenta where codigo=?");
            st.setInt(1, cta.getCodigo());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return ctas;
    }
}
