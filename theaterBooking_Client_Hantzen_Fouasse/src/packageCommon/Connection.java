/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packageCommon;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Kevin
 */
public class Connection {
    private String email;
    private String password;
    
    public Connection (String email, String password) {
        this.email    = email;
        this.password = password;
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
    * get and set password
    */
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String pwd) {
        this.password = pwd;
    }
    
    
    public void sendDataToServer() {

        try {
            Socket socket = new Socket("localhost", 4444);

            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.flush();    
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());            
            out.writeObject(this);
            out.flush();
        } catch (Exception e) {
            System.out.println("333");
        }
    }
    
    
}
