package za.ac.cput.pattern.structural.facade;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Revar
 */

public class FacadeJUnitTest {

    private static Facade facade;
    
    public FacadeJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        facade = new Facade();
    }
    
    @Test
    public void testFacade() {
        int x = 3;
        
        System.out.println("Cube of " + x + ": " + facade.cube(x));
        System.out.println("Cube of " + x + " times 2: " + facade.cubeTimesTwo(x));
        System.out.println(x + " to the sixth power times 2: " + facade.powerSixTimesTwo(x));
    }
}