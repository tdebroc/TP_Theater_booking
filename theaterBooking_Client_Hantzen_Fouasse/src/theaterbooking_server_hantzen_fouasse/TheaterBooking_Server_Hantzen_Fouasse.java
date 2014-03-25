/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theaterbooking_server_hantzen_fouasse;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import packageCommon.*;

/**
 *
 * @author Kevin
 */
public class TheaterBooking_Server_Hantzen_Fouasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {
        ServerSocket s = new ServerSocket(4444);
        System.out.println("Socket serveur: " + s);
 
        Socket soc = s.accept();
 
        System.out.println("Serveur a accepte connexion: " + soc);
 
        ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
        out.flush();
 
        ObjectInputStream in = new ObjectInputStream(soc.getInputStream());
 
 
        System.out.println("Serveur a cree les flux");
 
        System.out.println("Serveur: donnees emises");
 
        Object objetRecu =  in.readObject();
 
        System.out.println(objetRecu.getClass());

        in.close();
        out.close();
        soc.close();
    }
}
