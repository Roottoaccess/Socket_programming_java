import java.net.Socket;
/* This is the cient socket desogn code */
public class client {
    public static void main(String[] args) {
        System.out.println("Client started....");

        try{
            Socket soc = new Socket("localhost", 9806);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
