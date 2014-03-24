/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theaterbooking_client_hantzen_fouasse.IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import theaterbooking_client_hantzen_fouasse.IHM.Listener.*;


/**
 *
 * @author Kevin
 */
public class ConnectionWindow extends Window {
        protected JTextField      emailField;
	protected JPasswordField  passwordField;
        protected Button          connectButton;
        
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
             
             JLabel email        = new JLabel("Email");
             JLabel password     = new JLabel("Password");
             this.emailField     = new JTextField(15);
             this.passwordField  = new JPasswordField(10);
             this.connectButton  = new Button("Connect");
             
             /*
             * HEY LISTEN !
             */
             this.connectButton.addActionListener(new ConnectionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println(emailField.getText());
                    System.out.println(passwordField.getPassword());
                }
             });

             panel.add(email);
             panel.add(emailField);
             panel.add(password);
             panel.add(passwordField);
             panel.add(this.connectButton);
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
