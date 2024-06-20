/* This is the server socket design code */

import java.net.ServerSocket;
import java.net.Socket;

public class server{
    public static void main(String[] args) {
        
        System.out.println("Waiting for client ......");
        try{
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection Established....");
        }catch(Exception e){
            System.out.println(e);
        }

        
    }
}