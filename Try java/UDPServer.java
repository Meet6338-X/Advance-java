import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket aSocket = null;
        try {
            aSocket = new DatagramSocket(1234); // Listen on port 1234
            byte[] buffer = new byte[1000];
            System.out.println("Server is ready...");

            while (true) {
                // Receive request
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);
                System.out.println("Received: " + new String(request.getData(), 0, request.getLength()));

                // Prepare and send reply
                String response = "I am fine, thank you!";
                byte[] responseBytes = response.getBytes();
                DatagramPacket reply = new DatagramPacket(responseBytes, responseBytes.length, request.getAddress(),
                        request.getPort());
                aSocket.send(reply);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (aSocket != null && !aSocket.isClosed()) {
                aSocket.close(); // Ensure the socket is closed
            }
        }
    }
}
