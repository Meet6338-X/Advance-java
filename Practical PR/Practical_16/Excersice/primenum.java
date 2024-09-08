// import java.io.*;
// import java.net.*;

// // Client file
// public class ClientP1 {
// public static void main(String [] args) throws Exception
// {
// int port = 9000;
// Socket s;
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// s = new Socket(InetAddress.getLocalHost(),port);
// PrintWriter pw = new PrintWriter(new
// OutputStreamWriter(s.getOutputStream()));
// BufferedReader brl = new BufferedReader(new
// InputStreamReader(s.getInputStream()));
// System.out.print("Enter any number: ");
// String str = br.readLine();
// pw.println(str);
// pw.flush();
// String msg = brl.readLine();
// if(msg.equals("true"))
// {
// System.out.println("It is a prime number");
// }
// else
// {
// System.out.println("It is not a prime number");
// }

// }
// }
// // Serverfile
// import java.io.*;
// import java.net.*;

// public class ServerP1 {

// public static void main(String[] args) throws Exception {
// Socket s;
// int port = 9000;
// ServerSocket ss = new ServerSocket(port);
// System.out.println("Waiting for client");
// s = ss.accept();
// BufferedReader br = new BufferedReader(new
// InputStreamReader(s.getInputStream()));
// PrintWriter pw = new PrintWriter(new
// OutputStreamWriter(s.getOutputStream()));
// int num = Integer.parseInt(br.readLine());

// boolean flag = false;
// for (int i = 2; i <= num / 2; ++i) {
// // condition for nonprime number
// if (num % i == 0) {
// flag = true;
// break;
// }
// }
// System.out.println("Number sent by client: " + num);
// if (!flag)
// pw.println("true");
// else
// pw.println("false");

// }
// }
