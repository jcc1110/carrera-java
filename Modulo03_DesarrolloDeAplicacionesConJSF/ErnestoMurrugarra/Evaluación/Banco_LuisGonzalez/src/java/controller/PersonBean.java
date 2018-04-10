/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import model.person;

@Named(value = "pb")
@ApplicationScoped

public class PersonBean  implements Serializable{
    
    public static final long serialVersionUID = 1L;
    private person PersonaObj;
    private List<person> PersonaLst;
    
   
    public PersonBean() {
        // Simulando una consulta a una tabla 
        this.PersonaObj = new person();
        this.PersonaLst = new ArrayList<>();
        this.PersonaLst.add(new person("Luis", "Gonzalez", 24471233, "luis","123", 1, 99999.99));
       

    }

    public person getPersonaObj() {
        return PersonaObj;
    }

    public void setPersonaObj(person PersonaObj) {
        this.PersonaObj = PersonaObj;
    }

    public List<person> getPersonaLst() {
        return PersonaLst;
    }

    public void setPersonaLst(List<person> PersonaLst) {
        this.PersonaLst = PersonaLst;
    }

   
/*---------------------------------modificar ------*/
    

   public String editPerson(person persona) {
      PersonaObj.setCanEdit(true);
      return null;
   }
    public String savePerson() {
      
      //set "canEdit" of all employees to false 
      
      for (person per : PersonaLst) {
         per.setCanEdit(false);
      }		
      return null;
   }

}
