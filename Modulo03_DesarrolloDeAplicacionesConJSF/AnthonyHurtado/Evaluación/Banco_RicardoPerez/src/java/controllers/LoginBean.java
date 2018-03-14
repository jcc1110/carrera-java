package controllers;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import models.Operations;
import models.User;
import models.account;
import models.movement;
import structures.MyExceptions;

@Named(value = "loginBean")
@ApplicationScoped
public class LoginBean implements Serializable {

    private static final long serialVersionUID = 1L;

    //Login
    private String card;
    private String password;
    protected User UserConnected = new User();

    //add_accounts
    private String NewAccountNumber;
    private String Newowner;
    private String Newid;

    //movement
    private List<account> listaccountsadd;
    private List<movement> listmovement;

    //transfer
    private float transferamount;
    private String transferaccount;

    //personal information
    private String confirmpassword;
    private String newpassword;

    public LoginBean() {
    }

    //getters and setters
    public String getCard() {
        return card;
    }

    public void setCard(String username) {
        this.card = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUserConnected() {
        return UserConnected;
    }

    public void setUserConnected(User UserConnected) {
        this.UserConnected = UserConnected;
    }

    public String getNewAccountNumber() {
        return NewAccountNumber;
    }

    public void setNewAccountNumber(String NewAccountNumber) {
        this.NewAccountNumber = NewAccountNumber;
    }

    public String getNewowner() {
        return Newowner;
    }

    public void setNewowner(String Newowner) {
        this.Newowner = Newowner;
    }

    public String getNewid() {
        return Newid;
    }

    public void setNewid(String Newid) {
        this.Newid = Newid;
    }

    public List<account> getListaccountsadd() {
        return listaccountsadd;
    }

    public void setListaccountsadd(List<account> listaccountsadd) {
        this.listaccountsadd = listaccountsadd;
    }

    public List<movement> getListmovement() {
        return listmovement;
    }

    public void setListmovement(List<movement> listmovement) {
        this.listmovement = listmovement;
    }

    public String getTransferaccount() {
        return transferaccount;
    }

    public void setTransferaccount(String transferaccount) {
        this.transferaccount = transferaccount;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public float getTransferamount() {
        return transferamount;
    }

    public void setTransferamount(float transferamount) {
        this.transferamount = transferamount;
    }

    //Calls to model
    public String login() {
        String result;

        User loginuser = new User();
        loginuser.setCard(this.getCard());
        loginuser.setPassword(this.getPassword());
        Operations loginop = new Operations();
        Operations op = new Operations();
        Operations opmovement = new Operations();

        try {
            UserConnected = loginop.Login(loginuser);
            this.card = "";
            this.password = "";
            this.listaccountsadd = op.indexAccount(this.UserConnected);
            this.listmovement = opmovement.IndexMovement(this.UserConnected);
            result = "success";
            HttpSession session = this.getCurrentSession();
            session.setAttribute("username", this.UserConnected.getId());
        } catch (MyExceptions ex) {
            result = "error";
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error! Código:" + ex.getCode() + " " + ex.getMessage(), "");
            FacesContext.getCurrentInstance().addMessage(null, fm);    
        }

        return result;
    }

    public String logout() {
        HttpSession session = this.getCurrentSession();
        session.removeAttribute("username");
        session.invalidate();
        this.UserConnected=null;
        this.listmovement=null;
        this.listaccountsadd=null;
        return "login";
    }

    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }

    public void addAccount() {
        Operations loginop = new Operations();
        Operations updatelist = new Operations();
        Boolean result;

        try {
            result = loginop.AddAccount(this.getUserConnected(), this.getNewAccountNumber(), this.getNewowner(), this.getNewid());
            this.setNewAccountNumber("");
            this.setNewid("");
            this.setNewowner("");

            this.listaccountsadd = updatelist.indexAccount(this.UserConnected);

        } catch (MyExceptions ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void transfer() {
        Operations op = new Operations();
        Operations movementop = new Operations();
        Boolean result;

        try {
            result = op.Withdraw(this.UserConnected, this.getTransferamount());
            this.listmovement = movementop.IndexMovement(this.UserConnected);
            this.UserConnected.setBalance(this.UserConnected.getBalance() - (this.getTransferamount()));
            this.setTransferamount(0);
        } catch (MyExceptions ex) {
            //mensaje de error
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void changepassword() {
        if (this.getConfirmpassword().equals(this.getNewpassword())) {
            Operations op = new Operations();
            boolean result = false;
            try {
                result = op.ChangePassword(this.UserConnected, this.getNewpassword());
                if (result == true) {
                    this.setNewpassword("");
                    this.setConfirmpassword("");
                } else {
                    //lanzo error
                }
            } catch (MyExceptions ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

        }
    }

}
