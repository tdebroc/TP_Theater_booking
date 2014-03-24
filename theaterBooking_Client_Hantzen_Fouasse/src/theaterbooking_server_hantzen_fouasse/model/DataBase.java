/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theaterbooking_server_hantzen_fouasse.model;
import java.sql.*;

/**
 *
 * @author Kevin
 */
public class DataBase {
    protected static DataBase db = null;
    protected Connection conn = null;
    
    protected DataBase() {
        try
        {
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          String url = "jdbc:mysql://localhost/theaterBooking";
          conn = DriverManager.getConnection(url, "root", "");
          conn.close();
        }
        catch (ClassNotFoundException ex) {System.err.println(ex.getMessage());}
        catch (IllegalAccessException ex) {System.err.println(ex.getMessage());}
        catch (InstantiationException ex) {System.err.println(ex.getMessage());}
        catch (SQLException ex)           {System.err.println(ex.getMessage());}        
    }
    
    public static DataBase getDatabase() {
        if (db == null) {
            db = new DataBase();
        }     
        return db;
    }
    
    /*
    * execute select query
    */
    public ResultSet executeSelectQuery(String query) {
        try
        {
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery(query);
          return rs;
        }
        catch (SQLException ex)
        {
          System.err.println(ex.getMessage());
        }
        
        ResultSet rs = null;
        return rs;
    }
    /*
    * execute, insert, update and delete query
    */
    public boolean executeQuery(String query) {
        int result = 0;
        
        try
        {
          Statement st = conn.createStatement();
          result       = st.executeUpdate(query);
        }
        catch (SQLException ex)
        {
          System.err.println(ex.getMessage());
        }       
        return result != 0;
    }
}
