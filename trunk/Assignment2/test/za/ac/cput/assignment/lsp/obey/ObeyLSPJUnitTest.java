package za.ac.cput.assignment.lsp.obey;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.lsp.obey.conf.Config;
import za.ac.cput.assignment.lsp.obey.model.Bird;
import za.ac.cput.assignment.lsp.obey.model.FlightlessBird;
import za.ac.cput.assignment.lsp.obey.service.BirdHandler;
import za.ac.cput.assignment.lsp.obey.service.FlightlessBirdHandler;

/**
 *
 * @author Zac Blazic
 */

public class ObeyLSPJUnitTest
{
    private static ApplicationContext context;
    
    public ObeyLSPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    public void testLaunchBird() 
    {
        Bird sparrow = new Bird("Sparrow", 0.09);
        BirdHandler birdHandler = (BirdHandler)context.getBean("birdHandler");
        birdHandler.launchBird(sparrow);
        
        Assert.assertTrue(sparrow.isFlying());
    }
    
    @Test
    public void testLaunchFlightlessBird() 
    {
        FlightlessBird ostrich = new FlightlessBird("Ostrich", 124);
        FlightlessBirdHandler flightlessBirdHandler = (FlightlessBirdHandler)context.getBean("flightlessBirdHandler");
        flightlessBirdHandler.launchBird(ostrich);
        
        Assert.assertTrue(ostrich.isRunning());
    }
}