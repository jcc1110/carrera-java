/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import java.util.List;
import models.Empleado;
import models.User;
import models.account;
import models.movement;

/**
 *
 * @author ricardoperez
 */
public interface I_Process {

    public abstract User Login(User _user) throws MyExceptions;

    public abstract boolean ChangePassword(User _user, String _password) throws MyExceptions;

    public abstract boolean Withdraw(User user, float ammount) throws MyExceptions;

    public abstract List<movement> IndexMovement(User _user) throws MyExceptions;

    public abstract boolean AddAccount(User _user, String account, String owner, String ownerid) throws MyExceptions;

    public abstract List<account> indexAccount(User _user) throws MyExceptions;

}
