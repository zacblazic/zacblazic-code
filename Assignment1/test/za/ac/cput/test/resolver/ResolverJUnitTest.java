package za.ac.cput.test.resolver;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.resolver.Resolver;

/**
 *
 * @author Revar
 */
public class ResolverJUnitTest {
    
    public ResolverJUnitTest() 
    {
    }
    
    @Test(timeout=1000)
    public void testResolve() 
    {
        //These are bound to fail as IP addresses can change
        Assert.assertEquals("198.54.223.4", Resolver.resolve("www.cput.ac.za"));
        Assert.assertEquals("208.80.152.201", Resolver.resolve("wikipedia.org"));
        Assert.assertEquals("64.34.119.12", Resolver.resolve("stackoverflow.com"));
    }
}
