import java.net.*;

public class DgramRec {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, 1024);
        ds.receive(dp);
        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);
        ds.close();
    }
}

// import java.net.*;

// public class DGramSender {
// public static void main(String[] args) throws Exception {
// DatagramSocket ds = new DatagramSocket();
// String str = "Java is Easy!!!!!";
// InetAddress ip = InetAddress.getByName("127.0.0.1");
// DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),
// ip, 3000);
// ds.send(dp);
// ds.close();
// }
// }
