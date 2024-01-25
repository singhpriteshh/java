import java.net.*;

/**
 * ipAddress
 */
public class ipAddress {

    public static void main(String[] args) throws Exception 
    {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("IP address system is\n" + ip.getHostAddress());
    }
}