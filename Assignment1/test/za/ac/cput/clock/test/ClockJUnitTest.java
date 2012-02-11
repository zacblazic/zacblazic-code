package za.ac.cput.clock.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.clock.Clock;
import za.ac.cput.clock.conf.ClockModule;

/**
 *
 * @author Zac Blazic
 */

public class ClockJUnitTest 
{
    private static Injector injector;
    
    public ClockJUnitTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        injector = Guice.createInjector(new ClockModule());
    }

    @Test
    public void testSetTime() 
    {
        Clock clock = injector.getInstance(Clock.class);
        clock.set(28, 30, 70);
        
        Assert.assertEquals(0, clock.getHours());
        Assert.assertEquals(31, clock.getMinutes());
        Assert.assertEquals(10, clock.getSeconds());
    }
    
    @Test
    public void testAddTime() 
    {
        Clock clock = injector.getInstance(Clock.class);
        clock.set(5, 10, 5);
        clock.add(10, 90, 100);
        
        Assert.assertEquals(16, clock.getHours());
        Assert.assertEquals(41, clock.getMinutes());
        Assert.assertEquals(45, clock.getSeconds());
    }
    
    @Test
    public void testIncrementTime()
    {
        Clock clock = injector.getInstance(Clock.class);
        clock.set(2, 43, 20);
        clock.increment();
        
        Assert.assertEquals(3, clock.getHours());
        Assert.assertEquals(44, clock.getMinutes());
        Assert.assertEquals(21, clock.getSeconds());
    }
    
    @Test
    public void testResetTime() 
    {
        Clock clock = injector.getInstance(Clock.class);
        clock.set(7, 90, 53);
        clock.reset();
        
        Assert.assertEquals(0, clock.getHours());
        Assert.assertEquals(0, clock.getMinutes());
        Assert.assertEquals(0, clock.getSeconds());
    }
}