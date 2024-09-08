import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class inetAddressip {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the host Name");
            Scanner ob = new Scanner(System.in);
            String host = ob.nextLine();
            InetAddress local = InetAddress.getByName(host);
            String address = local.getHostAddress();
            String hostName = local.getHostName();
            System.out.println("Local Host IP Address :" + address);
            System.out.println("Local Host Name :" + hostName);
        } catch (UnknownHostException e) {
        }
    }
}