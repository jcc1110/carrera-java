package db;
import java.sql.ResultSet;
import structures.DataAccessAbstract;
import structures.OperationInterface;

public class DataAccessPerson extends DataAccessAbstract implements OperationInterface {
    @Override
    public void findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findOne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean validateUser(String username, String password) {
        boolean _isUser = false;
        String sql;
        ResultSet result;
        String _username = username.toLowerCase();
        String _password = password;
        
        /*sql = "SELECT firstname, lastname FROM person";
        sql += " WHERE username=" +_username + " AND ";
        sql += "password=" + _password + ";";
        result = super.executeWithResult(sql);*/
        
        /*try {
             if (result.first()) {
                _isUser = true;
             }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }*/

        return _isUser;
    }
}
