import java.io.*;
import java.net.*;

public class ShivamUrlConnection {
    public static void main(String[] args) {
        try {
            // Using the constructor: URLConnection(URL url)
            URL url = new URL("https://www.google.com");
            URLConnection connection = url.openConnection(); // This opens the connection but does not connect yet.
            System.out.println("URLConnection created for URL: " + url);

            // Using the connect() method
            connection.connect(); // Establish the connection to the remote resource
            System.out.println("Connection established.");

            // Using getURL() method
            System.out.println("URL from connection: " + connection.getURL());

            // Using getContentLength() method
            System.out.println("Content Length: " + connection.getContentLength());

            // Using getContentType() method
            System.out.println("Content Type: " + connection.getContentType());

            // Using getDate() method (returns the value of the date header)
            System.out.println("Date: " + connection.getDate());

            // Using getLastModified() method
            System.out.println("Last Modified: " + connection.getLastModified());

            // Using getContent() method (this retrieves the content from the URL)
            Object content = connection.getContent(); // This returns an Object, which can be cast to specific types
            System.out.println("Content from URL (type: " + content.getClass().getName() + ")");

            // Using getContent(Class[] classes) method to retrieve content as a specific
            // type
            // Let's specify a class to retrieve the content as InputStream
            Object contentWithClass = connection.getContent(new Class[] { InputStream.class });
            System.out.println("Content as InputStream: " + contentWithClass.getClass().getName());

            // Using getInputStream() method to retrieve the input stream from the URL
            // connection
            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            System.out.println("\nContent from the URL (reading first 5 lines):");
            int count = 0;
            while ((line = reader.readLine()) != null && count < 5) {
                System.out.println(line);
                count++;
            }

            // Using getOutputStream() method to send data to the URL connection
            OutputStream outputStream = connection.getOutputStream();
            String dataToSend = "name=JohnDoe&age=25";
            outputStream.write(dataToSend.getBytes());
            outputStream.flush();
            System.out.println("\nData sent to the URL: " + dataToSend);

            // Using getPort(), getProtocol(), getHost(), getFile(), getPath(), getQuery()
            System.out.println("\nURL Details:");
            System.out.println("Port: " + connection.getURL().getPort()); // Get the port of the URL
            System.out.println("Protocol: " + connection.getURL().getProtocol()); // Get the protocol (http or https)
            System.out.println("Host: " + connection.getURL().getHost()); // Get the host (domain)
            System.out.println("File: " + connection.getURL().getFile()); // Get the file (path)
            System.out.println("Path: " + connection.getURL().getPath()); // Get the path
            System.out.println("Query: " + connection.getURL().getQuery()); // Get the query parameters

            // Using allowUserInteraction and useCaches flags
            connection.setAllowUserInteraction(true);
            connection.setUseCaches(true);
            System.out.println("\nUser interaction allowed: " + connection.getAllowUserInteraction());
            System.out.println("Using caches: " + connection.getUseCaches());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}