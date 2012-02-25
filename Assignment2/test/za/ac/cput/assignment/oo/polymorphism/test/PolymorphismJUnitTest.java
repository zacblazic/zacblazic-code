package za.ac.cput.assignment.oo.polymorphism.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.oo.polymorphism.conf.Config;
import za.ac.cput.assignment.oo.polymorphism.model.Bulb;
import za.ac.cput.assignment.oo.polymorphism.model.CompactFluorescentBulb;
import za.ac.cput.assignment.oo.polymorphism.model.LightSocket;
import za.ac.cput.assignment.oo.polymorphism.service.LightingService;

/**
 *
 * @author Zac Blazic
 */

public class PolymorphismJUnitTest
{
    private static ApplicationContext context;
    
    public PolymorphismJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }
    
    /*
     * In this case we are passing the base class Bulb to the
     * changeBulb method.
     */
    @Test
    public void testChangeBulbNormal()
    {
        Bulb bulb = new Bulb(60);
        LightSocket socket = new LightSocket(60);
        LightingService lightingService = (LightingService)context.getBean("lightingService");
        lightingService.changeBulb(socket, bulb);
        
        Assert.assertSame(bulb, socket.getBulb());
    }

    /*
     * Here we are demonstrating polymorphism by passing 
     * CompactFluorescentBulb to the changeBulb method.
     */
    @Test
    public void testChangeBulbCFL() 
    {
        CompactFluorescentBulb bulb = new CompactFluorescentBulb(60);
        LightSocket socket = new LightSocket(60);
        LightingService lightingService = (LightingService)context.getBean("lightingService");
        lightingService.changeBulb(socket, bulb);
        
        Assert.assertSame(bulb, socket.getBulb());
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testChangeBulbException() 
    {
        CompactFluorescentBulb bulb = new CompactFluorescentBulb(100);
        LightSocket socket = new LightSocket(60);
        LightingService lightingService = (LightingService)context.getBean("lightingService");
        lightingService.changeBulb(socket, bulb);
        
        Assert.assertSame(bulb, socket.getBulb());
    }
}