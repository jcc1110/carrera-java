package controllers;
import entities.Afiliacion;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import entities.DataAccess;
import entities.Usuario;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.I_ATM;
import structure.MyExceptions;

public class ProcessController implements I_ATM {
    
    @Override
    public Usuario validarUsuario(Usuario usuario) throws MyExceptions{
        DataAccess bd = new DataAccess();
       
         return bd.validar(usuario);
         
    }

    @Override
    public String obtenerSaldo(Usuario usuario) {
        DataAccess bd = new DataAccess();
        return bd.ConsultarSaldo(usuario);
    }

    @Override
    public boolean Retiro(Usuario usuario, String monto) {
        DataAccess bd = new DataAccess();
        return bd.Retirar(usuario, monto);
    }

    @Override
    public boolean Deposito(Usuario usuario, String monto) {
        DataAccess bd = new DataAccess();
        return bd.Depositar(usuario, monto);
    }

    @Override
    public boolean CambioClave(Usuario usuario, String monto) {
        DataAccess bd = new DataAccess();
        return bd.CambiarClave(usuario,monto);
    }
    
    public void crearArchivo(String ruta) {
        File archivo = new File(ruta);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }
        public void anexar(String ruta, String contenido) {
        File archivo = new File(ruta);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.println();
            salida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public boolean AddAccount(Usuario _usuario, String ctaTipo, String nroCuenta, String banco, String nombre)  throws MyExceptions {
        String sqlinsert;
        int result;
        String usuario = _usuario.getUsrId();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = new java.util.Date();
        String datetoDB = dateFormat.format(date);
        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();

            sqlinsert = "INSERT INTO AFILIACION (usr_id, cta_tipo, nro_Cuenta,banco,nombre) VALUES ('" + usuario + "','" + ctaTipo + "','" + nroCuenta + "','" + banco +"','" + nombre + "')";

            result = sta.executeUpdate(sqlinsert);
            if (result >0) {
                return true;
            } else {
                return false;

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean ChangeData(Usuario _usrId, String _usr_Cedula, String nombre) throws MyExceptions {
        String UpdateSql;
        int result;
        String usuario=_usrId.getUsrId();
        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();
            UpdateSql = "UPDATE USUARIO set usr_cedula='" + _usr_Cedula + "', nombre='"+nombre+"' where usr_id='" + usuario + "'";
            result = sta.executeUpdate(UpdateSql);
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }        

    @Override
    public Afiliacion ConsultarNroCuenta(Afiliacion afiliacion) throws MyExceptions {
        DataAccess bd = new DataAccess();
        return bd.ConsultarNroCuenta(afiliacion);
    }
}