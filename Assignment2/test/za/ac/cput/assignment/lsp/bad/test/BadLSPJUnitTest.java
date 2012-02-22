package za.ac.cput.assignment.lsp.bad.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.assignment.lsp.bad.Bird;
import za.ac.cput.assignment.lsp.bad.BirdHandler;
import za.ac.cput.assignment.lsp.bad.Ostrich;

/**
 *
 * @author Zac Blazic
 */

public class BadLSPJUnitTest
{
    private static BirdHandler birdHandler;
    
    public BadLSPJUnitTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        birdHandler = new BirdHandler();
        System.out.println("* Bad LSP Tests");
    }

    @Test
    public void testBird() 
    {
        Bird bird = new Bird();
        
        System.out.print("Bird: ");
        birdHandler.launchBird(bird);
        
        Assert.assertTrue(bird.isFlying());
    }
    
    @Test
    public void testOstrich() 
    {
        Bird ostrich = new Ostrich();
        
        System.out.print("Ostrich: ");
        birdHandler.launchBird(ostrich);
        
        Assert.assertFalse(ostrich.isFlying());
    }
}