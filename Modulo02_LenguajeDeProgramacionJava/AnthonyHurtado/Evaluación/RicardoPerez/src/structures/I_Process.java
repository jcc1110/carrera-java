/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import models.User;

/**
 *
 * @author ricardoperez
 */
public interface I_Process {
    
    public abstract User Login (User user) throws MyExceptions;
    
    public abstract boolean ChangePassword (User user, String password) throws MyExceptions;
    
    public abstract boolean Deposit (User user, float ammount) throws MyExceptions;
    
    public abstract boolean Withdraw (User user, float ammount) throws MyExceptions;

}
