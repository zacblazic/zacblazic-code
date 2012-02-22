package za.ac.cput.lsp.good.test;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.lsp.good.FlightlessBird;
import za.ac.cput.lsp.good.FlightlessBirdHandler;
import za.ac.cput.lsp.good.Ostrich;

/**
 *
 * @author Zac Blazic
 */

public class GoodLSPJUnitTest
{
    private static FlightlessBirdHandler flightlessBirdHandler;
    
    public GoodLSPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        flightlessBirdHandler = new FlightlessBirdHandler();
        System.out.println("* Good LSP Tests");
    }

    @Test
    public void testFlightlessBird() 
    {
        FlightlessBird bird = new FlightlessBird();
       
        System.out.print("Flightless bird: ");
        flightlessBirdHandler.launchBird(bird);
        
        Assert.assertTrue(bird.isRunning());
    }
    
    @Test
    public void testOstrich()
    {
        FlightlessBird ostrich = new Ostrich();
        
        System.out.print("Ostrich: ");
        flightlessBirdHandler.launchBird(ostrich);
        
        Assert.assertTrue(ostrich.isRunning());
    }
}