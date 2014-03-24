/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theaterbooking_client_hantzen_fouasse.IHM;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Kevin
 */
public class Window extends JFrame {
    
    public Window() {
        super();
        build();
    }
    
    protected void build() {   
        //Title
        setTitle("Theater booking");
        //size
        setSize(700,700); //On donne une taille à notre fenêtre
        //center
        setLocationRelativeTo(null);
        //setResize
        setResizable(true);
        //Stop running when close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
