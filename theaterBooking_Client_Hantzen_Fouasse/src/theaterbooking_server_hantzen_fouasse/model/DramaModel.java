/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theaterbooking_server_hantzen_fouasse.model;
import java.sql.ResultSet;
import java.sql.SQLException;
import packageCommon.*;
/**
 *
 * @author Kevin
 */
public class DramaModel {
    protected DataBase dB;
    
    public DramaModel() {
        dB = DataBase.getDatabase();
    }
    
    public ListDrama getDrama() {  
        String query;
        Drama  drama;
        ListDrama dramaList = null;
        
        query = " SELECT id, name, seat"
              + " FROM DRAMA";
        
        ResultSet rs = dB.executeSelectQuery(query);
        
        try {
            drama = new Drama(rs.getInt("id"), rs.getString("name"), rs.getInt("seat"));
            dramaList = new ListDrama(drama); 
            
            while(rs.next()) {
                drama = new Drama(rs.getInt("id"), rs.getString("name"), rs.getInt("seat"));
                dramaList.addDrama(new ListDrama(drama));   
            }
        } catch (SQLException ex) {
            
        }
        
        return dramaList;
    }
}
