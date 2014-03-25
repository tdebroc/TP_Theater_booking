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
public class ListDrama {
    private Drama     drama;
    private ListDrama nextDrama;

    public ListDrama(Drama drama) {
        this.drama = drama;
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
    * get DramaName and Seat
    */
    public String getDramaName() {
        return this.drama.getName();
    }
    
    public int getDramaSeat() {
        return this.drama.getSeat();
    }
    
    /*
    * get and set nextDrama
    */
    public ListDrama getNextDrama() {
        return this.nextDrama;
    }
    
    public void setNextDrama(ListDrama drama) {
        this.nextDrama = drama;
    }
    
    /*
    * add Drama
    */
    public void addDrama(ListDrama newDrama) {
        if (this.nextDrama == null) {
            this.nextDrama = newDrama;
        } else {
            this.nextDrama.addDrama(newDrama);
        }
    }

}
