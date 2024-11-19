import java.io.*;
import java.net.*;

public class ShivamUrl {
    public static void main(String[] args) {
        try {
            // Using the constructor: URL(String spec)
            String spec = "https://www.example.com/index.html";
            URL url1 = new URL(spec);
            System.out.println("URL 1: " + url1);

            // Using the constructor: URL(String protocol, String host, int port, String
            // file)
            String protocol = "https";
            String host = "www.example.com";
            int port = 443; // default port for https
            String file = "/index.html";
            URL url2 = new URL(protocol, host, port, file);
            System.out.println("URL 2: " + url2);

            // Using the constructor: URL(String protocol, String host, int port, String
            // file, URLStreamHandler handler)
            // This is an advanced usage; typically we use default URLStreamHandler
            URLStreamHandler handler = null; // default handler
            URL url3 = new URL(protocol, host, port, file, handler);
            System.out.println("URL 3: " + url3);

            // Using the constructor: URL(String protocol, String host, String file)
            URL url4 = new URL("https", "www.example.com", "/index.html");
            System.out.println("URL 4: " + url4);

            // Using the constructor: URL(URL context, String spec)
            URL context = new URL("https://www.example.com");
            String spec2 = "index.html";
            URL url5 = new URL(context, spec2);
            System.out.println("URL 5: " + url5);

            // Using the constructor: URL(URL context, String spec, URLStreamHandler
            // handler)
            URL url6 = new URL(context, spec2, handler);
            System.out.println("URL 6: " + url6);

            // Demonstrating methods

            // set method (not directly used but will be called by URLStreamHandler)
            // set() is protected and generally not used directly in code

            // getPort(), getProtocol(), getHost(), getFile(), getPath(), getQuery()
            System.out.println("\nDetails of URL 1:");
            System.out.println("Port: " + url1.getPort()); // Get the port number
            System.out.println("Protocol: " + url1.getProtocol()); // Get the protocol
            System.out.println("Host: " + url1.getHost()); // Get the host
            System.out.println("File: " + url1.getFile()); // Get the file
            System.out.println("Path: " + url1.getPath()); // Get the path
            System.out.println("Query: " + url1.getQuery()); // Get the query part

            // equals() method - comparing two URLs
            boolean areEqual = url1.equals(url2);
            System.out.println("\nAre URL 1 and URL 2 equal? " + areEqual);

            // openConnection() method
            URLConnection connection = url1.openConnection();
            System.out.println("\nURLConnection: " + connection);

            // openStream() method - opens a stream to read content
            InputStream inputStream = url1.openStream();
            System.out.println("\nContent from URL 1:");
            int data = inputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
            inputStream.close();

            // getContent() method - getting content of URL
            Object content = url1.getContent();
            System.out.println("\n\nContent type: " + content.getClass().getName());

        } catch (MalformedURLException e) {
            System.err.println("MalformedURLException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}