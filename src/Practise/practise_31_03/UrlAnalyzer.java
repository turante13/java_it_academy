package Practise.practise_31_03;
import java.net.URL;

public class UrlAnalyzer {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.youtube.com/watch?v=aAkHRPNaqaI");
        String protocol = url.getProtocol();
        String host = url.getHost();
        String path = url.getPath();
        String query = url.getQuery();
        System.out.println("Protocol: " + protocol);
        System.out.println("Host: " + host);
        System.out.println("Path: " + path);
        System.out.println("Query: " + query);
    }
}