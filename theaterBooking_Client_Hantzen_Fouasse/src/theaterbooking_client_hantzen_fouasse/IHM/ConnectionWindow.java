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
public class ConnectionWindow extends Window {
        private JTextField      emailField;
	private JPasswordField  passwordField;
        
        public ConnectionWindow() {
            super();
            build();
            setContentPane(buildContentPane());     
        }
        
        /*
        * build connection Window
        */
        protected JPanel buildContentPane() {
             JPanel panel = new JPanel();
             panel.setLayout(new FlowLayout());
             panel.setBackground(Color.white);
             
             JLabel label        = new JLabel("Connection");
             
             this.emailField     = new JTextField(10);
             this.passwordField  = new JPasswordField(10);
             
             JButton connect     = new JButton(new ConnectAction(this, "Connect"));
             
             panel.add(label);
             panel.add(emailField);
             panel.add(passwordField);
             return panel; 
        }
        
        /*
        * get email field
        */
        public JTextField getEmailField() {
            return this.emailField;
        }
        
        /*
        * get password field
        */
        public JPasswordField getPasswordField() {
            return this.passwordField;
        }
}
