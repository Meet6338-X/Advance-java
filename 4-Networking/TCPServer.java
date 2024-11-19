import java.io.*;
import java.net.*;

public class TCPServer {

    public static void main(String[] args) {
        try {
            // 1. Create a ServerSocket bound to port 8080
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("TCPServer: Waiting for client connection on port " + serverSocket.getLocalPort());

            // 2. Accept incoming client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("TCPServer: Client connected from " + clientSocket.getInetAddress().getHostAddress());

            // 3. Get input/output streams for communication
            InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream();

            // 4. Read data from client
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String clientMessage = reader.readLine();
            System.out.println("TCPServer: Received message from client: " + clientMessage);

            // 5. Send response to the client
            PrintWriter writer = new PrintWriter(outputStream, true);
            writer.println("Hello from the TCPServer!");

            // 6. Get server and client socket details
            System.out.println("TCPServer: Local Port: " + serverSocket.getLocalPort());
            System.out.println("TCPServer: Client's Remote Address: " + clientSocket.getInetAddress());

            // 7. Close client and server sockets
            clientSocket.close();
            serverSocket.close();
            System.out.println("TCPServer: Server socket closed");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}