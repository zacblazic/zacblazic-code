package za.ac.cput.resolver.test;

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
        Assert.assertEquals("66.220.149.11", Resolver.resolve("facebook.com"));
        Assert.assertEquals("208.80.152.201", Resolver.resolve("wikipedia.org"));
        Assert.assertEquals("64.34.119.12", Resolver.resolve("stackoverflow.com"));
    }
}
