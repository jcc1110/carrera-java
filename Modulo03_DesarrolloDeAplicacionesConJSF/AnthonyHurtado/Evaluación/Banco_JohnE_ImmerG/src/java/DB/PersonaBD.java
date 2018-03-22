/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 3 de Java
 * @version 1.0
 */
package DB;
/**
 *
 * Metodos asociados a la tabla Persona
 * registrar,listar,leer y modificar
 * 
 */
import Modelos.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaBD extends BaseDeDatos {

    public void registrar(Persona per) throws Exception {
        
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("Insert into persona(codigo,Nombres,Apellidos,Sexo,Fecha_nacimiento,Clave)value(?,?,?,?,?,?)");
            st.setInt(1, per.getCodigo());
            st.setString(2, per.getNombres());
            st.setString(3, per.getApellidos());
            st.setString(4, per.getSexo());
            st.setString(5, per.getFecha_nacimiento());
            st.setString(6, per.getClave());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public List<Persona> listar() throws Exception {
        List<Persona> lista;
        ResultSet rs;
        try {
            super.Conectar();
            PreparedStatement st = super.getCn().prepareStatement("Select codigo,Nombres,Apellidos,Sexo,Fecha_nacimiento,Clave) from persona");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Persona per = new Persona();
                per.setCodigo(rs.getInt("codigo"));
                per.setNombres(rs.getString("Nombres"));
                per.setApellidos(rs.getString("Apellidos"));
                per.setSexo(rs.getString("Sexo"));
                per.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
                per.setClave(rs.getString("Clave"));
                lista.add(per);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    public Persona leerID(Persona per) throws Exception {
        Persona pers = null;
        ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("Select codigo,Nombres,Apellidos,Sexo,Fecha_nacimiento,Clave from persona where codigo=?");
            st.setInt(1, per.getCodigo());
            rs = st.executeQuery();
            while (rs.next()) {
                pers = new Persona();
                pers.setCodigo(rs.getInt("codigo"));
                pers.setNombres(rs.getString("nombres"));
                pers.setApellidos(rs.getString("apellidos"));
                pers.setSexo(rs.getString("sexo"));
                pers.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                pers.setClave(rs.getString("clave"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return pers;
    }

    public Persona modificar(Persona per) throws Exception {
        Persona pers = null;
        ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE persona set codigo=?,Nombres=?,Apellidos=?,Sexo=?,Fecha_nacimiento=?,Clave=? where codigo=?");
            st.setInt(1, per.getCodigo());
            st.setString(2, per.getNombres());
            st.setString(3, per.getApellidos());
            st.setString(4, per.getSexo());
            st.setString(5, per.getFecha_nacimiento());
            st.setString(6, per.getClave());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return pers;
    }

}
