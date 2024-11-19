import java.net.*;

public class UDPClient 
{ 
    public static void main(String args[])
    {
        DatagramSocket aSocket = null;
        try 
        {
            String s = "hello, how are you";
            aSocket = new DatagramSocket();
            byte[] m = s.getBytes();
            InetAddress aHost = InetAddress.getLocalHost();
            int serverPort = 1234;
            DatagramPacket request = new DatagramPacket(m, s.length(), aHost, serverPort);
            aSocket.send(request);

            // Prepare buffer to receive reply
            byte[] buffer = new byte[1000];
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
            aSocket.receive(reply);

            // Display the reply, trim to remove extra bytes
            System.out.println("Reply: " + new String(reply.getData(), 0, reply.getLength()));
        }
        catch (Exception e) 
        {
            System.out.println("Something went wrong!");
        }
        finally 
        {
            if (aSocket != null && !aSocket.isClosed()) {
                aSocket.close(); // Ensure socket is closed
            }
        }
    }
}
