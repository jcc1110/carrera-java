
package controller;
import model.person;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Luis
 */

@Named(value = "lg")
@ApplicationScoped
public class loginBean implements Serializable {
    public static final long serialVersionUID = 1L;
    private person PersonObj;
    private List<person> PersonLst;
    private String userbn;
    private String pswbn;
 
    public loginBean() {
    
    
    this.PersonObj = new person();
    this.PersonLst = new ArrayList<>();
    this.PersonLst.add(new person("Luis", "Gonzalez", 24478104,"luis","123", 1, 123333.33));
    
    }

  public person getPersonObj() {
        return PersonObj;
    }

    public void setPersonObj(person PersonObj) {
        this.PersonObj = PersonObj;
    }

    public List<person> getPersonLst() {
        return PersonLst;
    }

    public void setPersonLst(List<person> PersonLst) {
        this.PersonLst = PersonLst;
    }

    public String getUserbn() {
        return userbn;
    }

    public void setUserbn(String userbn) {
        this.userbn = userbn;
    }

    public String getPswbn() {
        return pswbn;
    }

    public void setPswbn(String pswbn) {
        this.pswbn = pswbn;
    }
    
       public String login(){
       String result;
           for (person persona: PersonLst) {
                persona.getUsername();
               persona.getPsw();
            PersonObj.setUsername(persona.getUsername());
             PersonObj.setPsw(persona.getPsw());
              
           }  
           
          if(PersonObj.getUsername().equals(this.getUserbn()) && PersonObj.getPsw().equals(this.getPswbn()))
         
       {    
            result ="dashboard";

           
        }   
   else {
            result = "error";
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña incorrectos", "");
            FacesContext.getCurrentInstance().addMessage(null, fm); 
            result="authentication";
 
        }
           

       return result;
       }

  
   /*---------------------------------modificar ------*/
    

   public String editLog(person persona) {
      PersonObj.setCanEdit(true);
      return null;
   }
    public String saveLog() {
      
      
      
      for (person per : PersonLst) {
         per.setCanEdit(false);
      }		
      return null;
   }
}       
            
        
               
               
                   
      
           
                
  
 
            
             
      

       
       
 


