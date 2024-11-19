import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            // Create a DatagramSocket on port 9876
            socket = new DatagramSocket(9876);
            System.out.println("Server is waiting for a message...");

            // Buffer for receiving the message
            byte[] receiveData = new byte[1024];

            while (true) {
                // Receive a packet from the client
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                // Get the message from the packet
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received message: " + message);
                System.out.println("From client address: " + clientAddress + ", port: " + clientPort);

                // Send a response back to the client
                String responseMessage = "Message received: " + message;
                DatagramPacket sendPacket = new DatagramPacket(responseMessage.getBytes(), responseMessage.length(),
                        clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}