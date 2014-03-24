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
public class User {
    private int    id;
    private String email;
    private String password;
    private String firstName;
    private String name;
    
    public User(int id, String email, String firstName, String name) {
        this.id        = id;
        this.email     = email;
        this.firstName = firstName;
        this.name      = name;
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
    * get and set email
    */
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    /*
    * get and set FirstName
    */
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
}
