/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theaterbooking_client_hantzen_fouasse.IHM;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Kevin
 */
public class ConnectAction extends AbstractAction{
    
    	private ConnectionWindow connectWindow;
	
	public ConnectAction(ConnectionWindow connectWindow, String text){
		super(text);
		
		this.connectWindow = connectWindow;
	}
    	public void actionPerformed(ActionEvent e) { 
		//Action lors du clic sur le bouton calculer
	} 
}
