import java.net.*;
import java.util.*;

public class inetaddresss {
    public static void main(String[] args) {

        try {
            InetAddress ipaddesslocaladrees = InetAddress.getLocalHost();
            System.out.println(ipaddesslocaladrees);
            InetAddress googleaddress = InetAddress.getByName("www.google.com");
            System.out.println(googleaddress);
            InetAddress yahooaddress[] = InetAddress.getAllByName("www.yahoo.com");
            for (int i = 1; i < yahooaddress.length; i++) {
                System.out.println(yahooaddress[i]);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}