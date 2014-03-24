/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theaterbooking_server_hantzen_fouasse.model;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import  packageCommon.*;
/**
 *
 * @author Kevin
 */
public class UserModel {
    protected DataBase dB;
    
    public UserModel() {
        dB = DataBase.getDatabase();
    }
    
    public User checkConnect(String email, String mdp) {
        String query;
        User   marie;
        byte[] bytes = mdp.getBytes();
        
        MessageDigest md = null;
        
        try {
            md = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
             e.printStackTrace();
        }
        
        mdp = new String(md.digest(bytes)); 
        email = email.replace("'", "");
        
        query = " SELECT id, email, password, name, firstName"
              + " From USER"
              + " WHERE email    = '" + email + "'"
              + " AND   password = '" + mdp   + "'";
        
        ResultSet rs = this.dB.executeSelectQuery(query);
        
        try {     
            if (rs != null) {
                marie = new User(rs.getInt("id"), rs.getString("email"), rs.getString("firstName"), rs.getString("name"));
                return marie;
            } else {
                return null;
            }      
        } catch (SQLException ex) {
          System.err.println(ex.getMessage());
        }
        
        return null;
    }
}
