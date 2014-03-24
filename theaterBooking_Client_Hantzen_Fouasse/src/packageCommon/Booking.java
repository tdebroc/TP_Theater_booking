/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packageCommon;

/**
 *
 * @author Kevin
 */
public class Booking {
    private int     userId;
    private int     dramaId;
    private int     seat;
    
    /*
    * get and set id
    */
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    /*
    * get and set dramaId;
    */
    public int getDramaId() {
        return this.dramaId;
    }
    
    public void setDramaId(int dramaId) {
        this.dramaId = dramaId;
    }
    
    /*
    * get and set seat
    */
    public int getSeat() {
        return this.seat;
    }
    
    public void setSeat(int seat) {
        this.seat = seat;
    }
}
