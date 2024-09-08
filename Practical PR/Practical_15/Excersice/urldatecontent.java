import java.net.*;
import java.util.Date;

public class urldatecontent {
    public static void main(String args[]) throws Exception {
        int c;
        URL url = new URL("http://www.tutorialride.com/java-technologies.htm");
        URLConnection urlc = url.openConnection();
        long d = urlc.getDate();
        if (d == 0)
            System.out.println("No date Information.");
        else
            System.out.println("Date: " + new Date(d));
        System.out.println("Content Type: " + urlc.getContentType());
        int len = urlc.getContentLength();
        if (len == -1)
            System.out.println("Content length not available");
        else
            System.out.println("Lenght of the Content: " + len);
        d = urlc.getExpiration();
        if (d == 0)
            System.out.println("No expiration information.");
        else
            System.out.println("Expires: " + new Date(d));
    }
}