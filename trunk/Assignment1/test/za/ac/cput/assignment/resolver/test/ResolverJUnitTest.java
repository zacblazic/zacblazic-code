package za.ac.cput.assignment.resolver.test;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.assignment.resolver.Resolver;
import za.ac.cput.assignment.resolver.Resolver;

/**
 *
 * @author Revar
 */
public class ResolverJUnitTest {
    
    public ResolverJUnitTest() 
    {
    }
    
    //These are bound to fail as IP addresses can change or severs can go down
    @Test(timeout=1000)
    public void testResolve() 
    {
        Assert.assertEquals("198.54.223.4", Resolver.resolve("www.cput.ac.za"));
        Assert.assertEquals("208.80.152.201", Resolver.resolve("wikipedia.org"));
        Assert.assertEquals("64.34.119.12", Resolver.resolve("stackoverflow.com"));
    }
}
