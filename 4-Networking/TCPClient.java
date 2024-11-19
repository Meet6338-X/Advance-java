import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // 1. Create a Socket to connect to the server on localhost at port 8080
            Socket socket = new Socket("localhost", 8080);
            System.out.println("TCPClient: Connected to server on port " + socket.getPort());

            // 2. Get input/output streams for communication
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            // 3. Send a message to the server
            PrintWriter writer = new PrintWriter(outputStream, true);
            writer.println("Hello from the TCPClient!");
            System.out.println("TCPClient: Message sent to server");

            // 4. Read the response from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String serverResponse = reader.readLine();
            System.out.println("TCPClient: Server response: " + serverResponse);

            // 5. Get socket details
            System.out.println("TCPClient: Local Port: " + socket.getLocalPort());
            System.out.println("TCPClient: Remote Port: " + socket.getPort());
            System.out.println("TCPClient: Remote Address: " + socket.getInetAddress());

            // 6. Close the socket
            socket.close();
            System.out.println("TCPClient: Socket closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}