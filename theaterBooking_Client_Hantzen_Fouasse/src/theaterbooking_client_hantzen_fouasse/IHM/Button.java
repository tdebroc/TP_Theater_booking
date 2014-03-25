/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theaterbooking_client_hantzen_fouasse.IHM;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Observer;
import javax.swing.*;
/**
 *
 * @author Kevin
 */
public class Button extends JButton {
    private String name;
    
    public Button (String str) {
        super(str);
        this.name = str;
    }
    
}
