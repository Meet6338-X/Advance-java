// import java.net.*;
// import java.io.*;

// // client file
// public class Clientv
// {
// public static void main(String[] args) throws Exception
// {
// Socket sock = new Socket("127.0.0.1", 3000);

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// OutputStream ostream = sock.getOutputStream();
// PrintWriter pwrite = new PrintWriter(ostream, true);

// InputStream istream = sock.getInputStream();
// BufferedReader receiveRead = new BufferedReader(new
// InputStreamReader(istream));

// System.out.println("Start the chitchat, type and press Enter key");

// String receiveMessage, sendMessage;
// while(true)
// {
// sendMessage = br.readLine(); // keyboard reading
// pwrite.println(sendMessage); // sending to server
// pwrite.flush(); // flush the data
// if((receiveMessage = receiveRead.readLine()) != null) //receive from server
// {
// System.out.println(receiveMessage); // displaying at DOS prompt
// }
// }
// }
// }
// // Server file
// import java.io.*;
// import java.net.*;

// public class Server {
// public static void main(String[] args) throws Exception {
// ServerSocket sersock = new ServerSocket(3000);
// System.out.println("Server ready for chatting");
// Socket sock = sersock.accept();
// // reading from keyboard (keyRead object)
// BufferedReader keyRead = new BufferedReader(new
// InputStreamReader(System.in));
// // sending to client (pwrite object)
// OutputStream ostream = sock.getOutputStream();
// PrintWriter pwrite = new PrintWriter(ostream, true);

// // receiving from server ( receiveRead object)
// InputStream istream = sock.getInputStream();
// BufferedReader receiveRead = new BufferedReader(new
// InputStreamReader(istream));

// String receiveMessage, sendMessage;
// while (true) {
// if ((receiveMessage = receiveRead.readLine()) != null) {
// System.out.println(receiveMessage);
// }
// sendMessage = keyRead.readLine();
// pwrite.println(sendMessage);
// pwrite.flush();
// }
// }
// }
