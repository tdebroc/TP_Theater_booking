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
public class BookingModel {
    protected DataBase dB;
    
    public BookingModel() {
        dB = DataBase.getDatabase();
    }
    
    /*
    * add booking 
    */
    public boolean addBooking(int dramaId, int userId, int seat) {
        
        String query;
        
        query = " INSERT INTO BOOKING"
              + " (idUser, idDrama, seat)"
              + " VALUES ("
              +   userId  + "," 
              +   dramaId + "," 
              +   seat;
        
        return dB.executeUpdateQuery(query);        
    }
    
    /*
    * list booking
    */
    public ListBooking listBooking(int userId) {
        ListBooking bookList = null;
        Booking     book;
        String      query;
        
        query = " SELECT d.name, b.idUser, b.idDrama ,b.seat"
              + " FROM BOOKING b NATURAL JOIN DRAMA d"
              + " WHERE b.idUser = " + userId;
        
        ResultSet rs = dB.executeSelectQuery(query);

        return bookList;
    }
}
