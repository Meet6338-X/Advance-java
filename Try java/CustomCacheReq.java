import java.io.*;
import java.net.*;

public class CustomCacheRequest extends CacheRequest {
    URI uri = URI.create("http://example.com");
    private ByteArrayOutputStream outputStream;

    // Constructor takes a URI
    public CustomCacheRequest(URI uri) {
        super(uri);
        this.outputStream = new ByteArrayOutputStream();
    }

    // Override the getBody() method to return the output stream for caching
    @Override
    public OutputStream getBody() throws IOException {
        return outputStream;
    }

    // Override the abort() method to simulate cache request abortion
    @Override
    public void abort() {
        try {
            outputStream.close(); // Close the output stream to abort
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get the cached data as a byte array
    public byte[] getCacheData() {
        return outputStream.toByteArray();
    }

    public static void main(String[] args) throws IOException {

        // Create an instance of CustomCacheRequest
        CustomCacheRequest cacheRequest = new CustomCacheRequest(uri);

        // Get the OutputStream for the cache body and write some data
        OutputStream outputStream = cacheRequest.getBody();
        String data = "This is some cached data!";
        outputStream.write(data.getBytes());
        outputStream.close(); // Close the stream after writing

        // Retrieve and print the cached data
        System.out.println("Cached Data: " + new String(cacheRequest.getCacheData()));

        // Abort the cache request (simulating cancellation)
        cacheRequest.abort();
    }
}
