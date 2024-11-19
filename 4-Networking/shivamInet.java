import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class shivamInet {
    public static void main(String[] args) {
        try {
            // 1. Create an InetAddress object using getByName
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("Host Address: " + address.getHostAddress());

            // 2. Create an InetAddress object for the local host
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localAddress.getHostName());
            System.out.println("Local Host Address: " + localAddress.getHostAddress());

            // 3. Get all IP addresses for a hostname
            InetAddress[] allAddresses = InetAddress.getAllByName("www.google.com");
            System.out.println("All IP Addresses for www.google.com:");
            for (InetAddress addr : allAddresses) {
                System.out.println("- " + addr.getHostAddress());
            }

            // 4. Use getAddress to retrieve the IP address in byte array form
            byte[] ipBytes = address.getAddress();
            System.out.println("IP Address (bytes): " + Arrays.toString(ipBytes));

            // 5. equals method to compare InetAddress objects
            InetAddress anotherAddress = InetAddress.getByName("www.google.com");
            System.out.println("Equals: " + address.equals(anotherAddress));

            // 6. hashCode method
            System.out.println("Hash Code: " + address.hashCode());

            // 7. Check if the address is a multicast address
            System.out.println("Is Multicast Address: " + address.isMulticastAddress());

            // 8. Use toString method to display the InetAddress
            System.out.println("InetAddress toString: " + address.toString());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}