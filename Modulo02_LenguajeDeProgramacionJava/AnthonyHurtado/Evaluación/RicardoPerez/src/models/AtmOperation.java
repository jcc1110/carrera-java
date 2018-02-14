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
import structures.MyExceptions;

/**
 *
 * @author ricardoperez
 */
public class AtmOperation {

    private String url = "./prueba.txt";

    public User Login(User user) throws MyExceptions {
        boolean result = false;
        String sql;

        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();

            sql = "SELECT * FROM USER WHERE card='" + user.getCard() + "' AND password='" + user.getPassword() + "'";

            ResultSet rs = sta.executeQuery(sql);
            if (rs.next()) {
                user.setName(rs.getString("name"));
                user.setBalance(this.Balance(user));
                user.setId(rs.getInt("id"));

                File file = new File(this.url);
                PrintWriter fileexit = new PrintWriter(new FileWriter(file));
                String log = "->Success Login";
                fileexit.println(log);
                fileexit.println();

            } else {
                throw new MyExceptions("Login Fail", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return user;

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

    public boolean ChangePassword(User user, String password) {

        String UpdateSql;
        int result;
        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();
            UpdateSql = "UPDATE USER set password='" + password + "' where card='" + user.getCard() + "'";
            result = sta.executeUpdate(UpdateSql);
            if (result == 1) {
                File file = new File(this.url);
                PrintWriter fileexit = new PrintWriter(new FileWriter(file, true));
                String log = "->Changed password";
                fileexit.println(log);
                fileexit.close();
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public boolean Deposit(User user, float amount) {

        String sqlinsert;
        int result;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = new java.util.Date();
        String datetoDB = dateFormat.format(date);
        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();

            sqlinsert = "INSERT INTO `MOVEMENT` (`id_user`, `movement_type`, `amount`,`date`) VALUES (" + user.getId() + ",1," + amount + ",'" + datetoDB + "')";

            result = sta.executeUpdate(sqlinsert);
            if (result == 1) {
                File file = new File(this.url);
                PrintWriter fileexit = new PrintWriter(new FileWriter(file, true));
                String log = "->Deposit "+Float.toString(amount);
                fileexit.println(log);
                fileexit.close();
                return true;
            } else {
                return false;

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public boolean Withdraw(User user, float amount) {

        String sqlinsert;
        int result;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = new java.util.Date();
        String datetoDB = dateFormat.format(date);
        try {
            DataAccess conection = new DataAccess();
            conection.connectToDB();
            Statement sta = conection.getCon().createStatement();

            sqlinsert = "INSERT INTO `MOVEMENT` (`id_user`, `movement_type`, `amount`,`date`) VALUES (" + user.getId() + ",2," + amount + ",'" + datetoDB + "')";

            result = sta.executeUpdate(sqlinsert);
            if (result == 1) {
       File file = new File(this.url);
                PrintWriter fileexit = new PrintWriter(new FileWriter(file, true));
                String log = "->Withdraw "+Float.toString(amount);
                fileexit.println(log);
                fileexit.close();
                return true;
            } else {
                return false;

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

}
