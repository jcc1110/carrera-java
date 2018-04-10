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
import model.User;
import model.person;


@Named(value = "ob")
@ApplicationScoped

public class OperationBean implements Serializable{
    
     public static final long serialVersionUID = 1L;
    private User UserObj;
    private List<User> UserLst;
    
    public OperationBean(){
    
    
    this.UserObj = new User();
    this.UserLst = new ArrayList<>();
    this.UserLst.add(new User("Juana", "Pérez", 23335331,2,200.00));
    
    }

    public User getUserObj() {
        return UserObj;
    }

    public void setUserObj(User UserObj) {
        this.UserObj = UserObj;
    }

    public List<User> getUserLst() {
        return UserLst;
    }

    public void setUserLst(List<User> UserLst) {
        this.UserLst = UserLst;
    }
      /*------------------Agregar------------------*/
         public void addUser() {		 
      this.UserLst.add(new User(
     
     this.UserObj.getName(),
     this.UserObj.getLastname(),
     this.UserObj.getCi(),
     this.UserObj.getNaccount(),
     this.UserObj.getSaldo()
             ));}
   /*---------------------------------modificar ------*/
    

   public String editUser(person usuario) {
      UserObj.setCanEdit(true);
      return null;
   }
    public String saveUser() {
      
            
      for (User us : UserLst) {
         us.setCanEdit(false);
      }		
      return null;
   }
    /*---------------Eliminar---------*/
 public void deleteUser(User empObj) {
        this.UserLst.remove(empObj);
    }
}
      
         

