/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.AtmOperation;
import models.User;
import structures.I_Process;
import structures.MyExceptions;

/**
 *
 * @author ricardoperez
 */
public class OperationController implements I_Process {

    @Override
    public User Login(User user) throws MyExceptions {    
        AtmOperation OperationLogin = new AtmOperation();
        return OperationLogin.Login(user);
    }

    @Override
    public boolean ChangePassword(User user, String password) throws MyExceptions {
        
        if (password.length()<=5){
        AtmOperation OperationChangePassword = new AtmOperation();
        return OperationChangePassword.ChangePassword(user, password);
        }
        else 
        {
                        throw new MyExceptions("The password is too long ", 2);
        }
    }

    @Override
    public boolean Deposit(User user, float ammount) throws MyExceptions {
        AtmOperation OperationDesposit = new AtmOperation();
        return OperationDesposit.Deposit(user, ammount);
    }

    @Override
    public boolean Withdraw(User user, float ammount) throws MyExceptions {
        AtmOperation OperationDesposit = new AtmOperation();
        return OperationDesposit.Withdraw(user, ammount);
    }

    
    
    
    
}
