import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 1234);
            InputStream maderchot = s.getInputStream();
            DataInputStream din = new DataInputStream(maderchot);
            String st = new String(din.readUTF());
            System.out.println(st);
            din.close();
            maderchot.close();
            s.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}