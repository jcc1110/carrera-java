package controllers;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    public String obtenerSaldo(User usuario) {
        DataAccess bd = new DataAccess();
        return bd.ConsultarSaldo(usuario);
    }

    @Override
    public boolean Retiro(User usuario, String monto) {
        DataAccess bd = new DataAccess();
        return bd.Retirar(usuario, monto);
    }

    @Override
    public boolean Deposito(User usuario, String monto) {
        DataAccess bd = new DataAccess();
        return bd.Depositar(usuario, monto);
    }

    @Override
    public boolean CambioClave(User usuario, String monto) {
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
}