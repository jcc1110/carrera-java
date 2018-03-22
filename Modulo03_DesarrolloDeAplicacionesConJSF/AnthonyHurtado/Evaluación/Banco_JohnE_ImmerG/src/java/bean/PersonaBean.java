/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 3 de Java
 * @version 1.0
 */
package bean;

import DB.PersonaBD;
import Modelos.Persona;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;


@Named(value = "personaBean")
@ApplicationScoped
public class PersonaBean {
    
    

    private Persona persona = new Persona();
    private List<Persona> lstPersona;
    
    public PersonaBean() throws Exception {
        this.listar();
    }

    public List<Persona> getLstPersona() {
        return lstPersona;
    }

    public void setLstPersona(List<Persona> lstPersona) {
        this.lstPersona = lstPersona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void registrar() {
          PersonaBD BD;
        try {
            BD = new PersonaBD();
            BD.registrar(persona);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void listar() throws Exception {
         PersonaBD BD;
        try {
            BD = new PersonaBD();
            this.setLstPersona(BD.listar());
        } catch (Exception e) {
            throw e;
        }
    }

    public void leerID(Persona per) throws Exception {
        PersonaBD BD;
        Persona temp;
        try {
            BD = new PersonaBD();
            temp = BD.leerID(per);
            if (temp != null) {
                this.persona = temp;
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificar() throws Exception {
        PersonaBD BD;
        try {
            BD = new PersonaBD();
            BD.modificar(persona);
        } catch (Exception e) {
            throw e;
        }
    }
    
     
    public void limpiar() throws Exception {
       this.persona.setCodigo(0);
       this.persona.setNombres("");
       this.persona.setApellidos("");
       this.persona.setFecha_nacimiento("");
       this.persona.setClave("");
    }
    


}
