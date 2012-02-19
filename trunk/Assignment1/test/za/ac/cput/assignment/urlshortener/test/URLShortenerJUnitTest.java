package za.ac.cput.assignment.urlshortener.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.assignment.urlshortener.URLShortener;
import za.ac.cput.assignment.urlshortener.URLShortener;
import za.ac.cput.assignment.urlshortener.conf.URLShortenerModule;

/**
 *
 * @author Zac Blazic
 */

public class URLShortenerJUnitTest 
{
    private static Injector injector;
    
    public URLShortenerJUnitTest() 
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        injector = Guice.createInjector(new URLShortenerModule());
    }
    
    @Test
    public void testShorten()
    {
        URLShortener shortener = injector.getInstance(URLShortener.class);
        
        String answer = shortener.shorten("www.google.com");
        
        Assert.assertNotNull(answer);
        Assert.assertTrue(answer.length() == 12);
        Assert.assertNotSame("www.google.com", answer);
        
        System.out.println("URLShortener: www.google.com = " + answer);
    }
}