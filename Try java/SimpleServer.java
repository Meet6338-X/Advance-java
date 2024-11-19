import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            ServerSocket s12 = new ServerSocket(1234);
            Socket s1 = s12.accept();
            OutputStream macherchot = s1.getOutputStream();
            DataOutputStream dos = new DataOutputStream(macherchot);
            dos.writeUTF("yaara yaara pausa tula daata toh mulgi, mulgi zaali mohoti pausa zaala chota");
            dos.close();
            s1.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}