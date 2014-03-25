package TheaterBooking_Client_Hantzen_Fouasse;

import packageCommon.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import theaterbooking_client_hantzen_fouasse.IHM.ConnectionWindow;
 
public class TheaterBooking_Client_Hantzen_Fouasse {
    private Socket socket = null;
    private ObjectInputStream inputStream = null;
    private ObjectOutputStream outputStream = null;
    private boolean isConnected = false;
 
    public TheaterBooking_Client_Hantzen_Fouasse () {
 
    }
 
    public void communicate(Object send) {
 
        while (!isConnected) {
            try {
                socket = new Socket("localHost", 4445);
                System.out.println("Connected");
                isConnected = true;
                outputStream = new ObjectOutputStream(socket.getOutputStream());
 
                outputStream.writeObject(send);
 
 
            } catch (SocketException se) {
                se.printStackTrace();
                // System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 
    public static void main(String[] args) {
        TheaterBooking_Client_Hantzen_Fouasse client = new TheaterBooking_Client_Hantzen_Fouasse();
        
        ConnectionWindow connectWindow = new ConnectionWindow();
        connectWindow.setVisible(true);

        client.communicate(connectWindow.getConnect());

    }
}