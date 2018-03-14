package controllers;
import entities.Afiliacion;
import entities.Usuario;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import structure.MyExceptions;

@Named(value = "loginBean")
@ApplicationScoped
public class LoginBean implements Serializable {
    // Atributos usuario
    private static final long serialVersionUID = 1L;
    private String usrId;   
    private String usrClave;    
    private String usrNombre;

    public String getUsrNombre() {
        return usrNombre;
    }

    public void setUsrNombre(String usrNombre) {
        this.usrNombre = usrNombre;
    }
   /* private String username;
    private String password;*/
    private String usrCedula;
    //Atributos Afiliaciones
    private String ctaTipo;
    private String nroCuenta;
    private String banco;
    private String nombre;

    public String getUsrClave() {
        return usrClave;
    }

    public void setUsrClave(String usrClave) {
        this.usrClave = usrClave;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getCtaTipo() {
        return ctaTipo;
    }

    public void setCtaTipo(String ctaTipo) {
        this.ctaTipo = ctaTipo;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos
    public String getUsername() {
        return usrId;
    }

    public void setUsername(String usrId) {
        this.usrId = usrId;
    }
    public String getUsrCedula() {
        return usrCedula;
    }    
    public void setUsrCedula(String usrCedula) {
        this.usrCedula = usrCedula;
    }    

/*    public String getPassword() {
        return usrClave;
    }
    public void setPassword(String usrClave) {
        this.usrClave = usrClave;
    }*/
    private Usuario conectuser = new Usuario();    
    public String login() {
        //String result;
        ProcessController pc = new ProcessController();
        Usuario usuario = new Usuario();
        usuario.setUsrId(this.getUsrId());
        usuario.setUsrClave(this.getUsrClave());
        /*.setUsrNombre(this.getUsrNombre());*/
        try {
            conectuser=pc.validarUsuario(usuario);
            return "success";
        } catch (MyExceptions ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
                return "error";
        }
    }
    public Usuario getConectuser() {
        return conectuser;
    }
    public void setConectuser(Usuario conectuser) {
        this.conectuser = conectuser;
    }
    public String logout() {
        HttpSession session = this.getCurrentSession();
        session.removeAttribute("usrId");
        session.invalidate();
        return "logout";
    }
    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
    public void addAccount() {
        ProcessController loginop = new ProcessController();
        Boolean result;

        try {
            result = loginop.AddAccount(this.conectuser,this.getCtaTipo(),this.getNroCuenta(), this.getBanco(), this.getNombre());
            this.setUsrId("");
            this.setCtaTipo("");
            this.setNroCuenta("");
            this.setBanco("");
            this.setNombre("");
        } catch (MyExceptions ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    
        public void changeData() {

            ProcessController op = new ProcessController();
            boolean result = false;
            try {
                result = op.ChangeData(this.conectuser , this.conectuser.getUsrCedula(),this.conectuser.getUsrNombre());
                if (result == true) {
                    /*this.setUsrCedula("");
                    this.setUsrNombre("");*/
                }
            } catch (MyExceptions ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        private Afiliacion afiliacion = new Afiliacion();
        public String validarNroCuenta() {
            ProcessController op = new ProcessController();
            Afiliacion afiliado = new Afiliacion();
            afiliacion.setNro_cuenta(this.getNroCuenta());
            try {
                afiliado = op.ConsultarNroCuenta(afiliacion);
                return afiliado.getNombre();
                //System.out.println("Este es el result en loginBean: "+result.getNombre());                
            } catch (MyExceptions ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
    }        
}
