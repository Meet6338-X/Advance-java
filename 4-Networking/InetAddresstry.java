import java.net.*;
import java.util.Arrays;

public class InetAddresstry {
    public static void main(String[] args) {
        try {
            // getByName
            InetAddress a = InetAddress.getByName("www.google.com");
            System.out.println(a);
            // getLocalHost
            InetAddress b = InetAddress.getLocalHost();
            System.out.println(b);
            // getHostName
            System.out.println("Host Name = " + b.getHostName());
            // getHostName
            System.out.println("IP Address = " + b.getHostAddress());
            // getAllbyName
            InetAddress[] array = InetAddress.getAllByName("www.google.com");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + "\n");
            }
            // getAddress
            byte[] ipb = a.getAddress();
            System.out.println(Arrays.toString(ipb));
            // hashcode
            System.out.println(a.hashCode());
            // Returns the hashcode based on the IP address of the object.
            // isMulticastAddress
            System.out.println(a.isMulticastAddress());
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}
