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
public class ListBooking {
    private Drama       drama;
    private int         bookingId;
    private int         seat;
    private ListBooking nextBooking = null;
    
    public ListBooking(Drama drama, int bookingId, int seat) {
        this.drama     = drama;
        this.bookingId = bookingId;
        this.seat      = seat;
    }
    
    /*
    * get and set drama
    */
    public Drama getDrama() {
        return this.drama;
    }
    
    public void setDrama(Drama drama) {
        this.drama = drama;
    }
    /*
    * get Drama Name
    */
    public String getDramaName() {
        return this.drama.getName();
    }
    
    /*
    * get and set bookingId
    */
    public int getBookingId() {
        return this.bookingId;
    }
    
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
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
    
    /*
    * get and set nextBooking
    */
    public ListBooking getNextBooking() {
        return this.nextBooking;
    }
    
    public void setNextBooking(ListBooking nextBooking) {
        this.nextBooking = nextBooking;
    }

    public void addBooking(ListBooking newBooking) {
        if (this.nextBooking == null) {
            this.nextBooking = newBooking;
        } else {
            this.nextBooking.addBooking(newBooking);
        }
    }
     
} 
