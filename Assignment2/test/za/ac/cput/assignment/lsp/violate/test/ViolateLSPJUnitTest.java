package za.ac.cput.assignment.lsp.violate.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.lsp.violate.conf.Config;
import za.ac.cput.assignment.lsp.violate.model.Bird;
import za.ac.cput.assignment.lsp.violate.model.FlightlessBird;
import za.ac.cput.assignment.lsp.violate.service.BirdHandler;

/**
 *
 * @author Zac Blazic
 */

public class ViolateLSPJUnitTest
{
    private static ApplicationContext context;
    
    public ViolateLSPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    public void testLaunchBirdBase()
    {
        Bird dove = new Bird("Dove", 0.17);
        BirdHandler birdHandler = (BirdHandler)context.getBean("birdHandler");
        birdHandler.launchBird(dove);
        
        Assert.assertTrue(dove.isFlying());
    }
    
    @Test
    public void testLaunchBirdDerived() 
    {
        FlightlessBird penguin = new FlightlessBird("Penguin", 28.0);
        BirdHandler birdHandler = (BirdHandler)context.getBean("birdHandler");
        birdHandler.launchBird(penguin);
        
        Assert.assertFalse(penguin.isFlying());
    }
}