package za.ac.cput.assignment.resolver;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Zac Blazic
 */

public class Resolver
{
    public static String resolve(String urlString) 
    {
        String address = "";
        
        try
        {
            address = InetAddress.getByName(urlString).toString();
            address = address.substring(address.indexOf("/") + 1);
        }
        catch(UnknownHostException uhe)
        {
            System.out.println(uhe);
        }
        
        return address;
    }
}
