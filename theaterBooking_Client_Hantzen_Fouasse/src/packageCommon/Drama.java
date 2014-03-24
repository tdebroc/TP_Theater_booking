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
public class Drama {
    private int     id;
    private String name;
    private int    seat;
    
    public Drama (int id, String name, int seat) {
        this.id   = id;
        this.name = name;
        this.seat = seat;
    }
    
    /*
    * get and set id
    */
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    /*
    * get and set Name
    */
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
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
