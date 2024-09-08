// // CLIENT CODE:

// import java.net.*;
// import java.io.*;
// import java.util.*;

// public class Practical_16_client {
// public static void main(String[] args) throws IOException {
// Socket s = new Socket("localhost" , 2020);
// System.out.println("Client Started, waiting for server response..");
// Scanner sc = new Scanner(System.in);
// System.out.print("\nEnter Username : ");
// String user = sc.nextLine();
// System.out.print("Enter password :");
// String pass = sc.nextLine();
// OutputStream out = s.getOutputStream(); //geta stream
// DataOutputStream dos = new DataOutputStream (out);
// dos.writeUTF(user);
// dos.writeUTF(pass);
// InputStream In = s.getInputStream();
// DataInputStream dis = new DataInputStream(In);
// String st = new String (dis.readUTF());
// System.out.println(st);
// }
// }
// // SERVER CODE:
// import java.io.*;
// import java.net.*;

// public class Practical_16_server {
// public static void main(String[] args) throws IOException {
// ServerSocket s = new ServerSocket(2020);
// System.out.println("Server Started ...........");
// System.out.println(" waiting for client.....");
// Socket s1 = s.accept();
// System.out.println(" Client connected to port number 2020");
// InputStream In = s1.getInputStream();
// DataInputStream dis = new DataInputStream(In);
// String abc = new String(dis.readUTF());
// String xyz = new String(dis.readUTF());
// OutputStream out = s1.getOutputStream(); // geta stream
// DataOutputStream dos = new DataOutputStream(out);
// if (abc.equals("aditya") && xyz.equals("aditya@123")) {
// dos.writeUTF("\nValid User ");
// } else {
// dos.writeUTF("\nInvalidUser ");
// }
// System.out.println("Data processed any reesult sent to client");
// }
// }
