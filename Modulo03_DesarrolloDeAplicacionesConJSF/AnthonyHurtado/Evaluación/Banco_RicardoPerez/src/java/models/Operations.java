/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import structures.I_Process;
import structures.MyExceptions;

/**
 *
 * @author ricardoperez
 */
public class Operations implements I_Process {

    @Override
    public User Login(User _user) throws MyExceptions {
        boolean result = false;
        String sql;

        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();

            sql = "SELECT * FROM USER WHERE card='" + _user.getCard() + "' AND password='" + _user.getPassword() + "'";

            ResultSet rs = sta.executeQuery(sql);
            if (rs.next()) {
                _user.setName(rs.getString("name"));
                _user.setBalance(this.Balance(_user));
                _user.setId(rs.getInt("id"));
                _user.setLastname(rs.getString("lastname"));
                _user.setAddress(rs.getString("address"));
//                _user.setLastname(rs.getDate("birthdate"));

            } else {
                throw new MyExceptions("Login Fail", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return _user;

    }

    @Override
    public boolean ChangePassword(User _user, String _password) throws MyExceptions {
        String UpdateSql;
        int result;
        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();
            UpdateSql = "UPDATE USER set password='" + _password + "' where card='" + _user.getCard() + "'";
            result = sta.executeUpdate(UpdateSql);
            if (result == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean Withdraw(User user, float ammount) throws MyExceptions {
        String sqlinsert;
        int result;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = new java.util.Date();
        String datetoDB = dateFormat.format(date);
        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();

            sqlinsert = "INSERT INTO `MOVEMENT` (`id_user`, `movement_type`, `amount`,`date`) VALUES (" + user.getId() + ",2," + ammount + ",'" + datetoDB + "')";

            result = sta.executeUpdate(sqlinsert);
            if (result == 1) {
                return true;
            } else {
                return false;

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<movement> IndexMovement(User _user) throws MyExceptions {
        String sql;
        List<movement> lstmovement = new ArrayList<>();

        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();

            sql = "select * from MOVEMENT,USER where MOVEMENT.id_user=USER.id and USER.card='" + _user.getCard() + "'";

            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                movement movementdetails = new movement();
                if (rs.getInt("movement_type") == 1) {
                    movementdetails.setType("DEPOSITO");
                } else {
                    movementdetails.setType("RETIRO");
                }
                movementdetails.setAmount(rs.getDouble("amount"));
                movementdetails.setDate(rs.getDate("date").toString());
                lstmovement.add(movementdetails);

            }
            return lstmovement;

        } catch (SQLException ex) {
            return lstmovement;
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    public float Balance(User user) {
        String DepositSql;
        String WithdrawSql;
        float AmountDeposit = 0;
        float WithdrawDeposit = 0;

        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();

            DepositSql = "select sum(amount) as total from MOVEMENT,USER where MOVEMENT.id_user=USER.id and USER.card='" + user.getCard() + "'and MOVEMENT.movement_type=1";
            WithdrawSql = "select sum(amount) as total from MOVEMENT,USER where MOVEMENT.id_user=USER.id and USER.card='" + user.getCard() + "'and MOVEMENT.movement_type=2";

            ResultSet rs = sta.executeQuery(DepositSql);

            if (rs.next()) {
                AmountDeposit = (rs.getFloat("total"));
            } else {
                AmountDeposit = 0;
            }

            rs = sta.executeQuery(WithdrawSql);

            if (rs.next()) {
                WithdrawDeposit = (rs.getFloat("total"));
            } else {
                WithdrawDeposit = 0;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return (AmountDeposit - WithdrawDeposit);
    }

    @Override
    public boolean AddAccount(User _user, String account, String owner, String ownerid) throws MyExceptions {
        String sqlinsert;
        int result;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = new java.util.Date();
        String datetoDB = dateFormat.format(date);
        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();

            sqlinsert = "INSERT INTO `ACCOUNT` (`accountnumber`, `owner`, `owner_id`,`id_user`) VALUES ('" + account + "','" + owner + "','" + ownerid + "'," + _user.getId() + ")";

            result = sta.executeUpdate(sqlinsert);
            if (result == 1) {
                return true;
            } else {
                return false;

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<account> indexAccount(User _user) throws MyExceptions {
        String sql;
        java.util.Date date = new java.util.Date();
//        account accountdetails = new account();
        List<account> lstAccount = new ArrayList<>();

        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();

//            sql = "SELECT * FROM ACCOUNT WHERE id_user=2";
            sql = "SELECT * FROM ACCOUNT WHERE id_user=" + _user.getId() + "";

            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                account accountdetails = new account();
                accountdetails.setAccountnumber(rs.getString("accountnumber"));
                accountdetails.setAccountowner(rs.getString("owner").toUpperCase());
                accountdetails.setOwneridnumber(rs.getString("owner_id"));
                lstAccount.add(accountdetails);

            }
            return lstAccount;

        } catch (SQLException ex) {
            return lstAccount;
        }
    }

}
