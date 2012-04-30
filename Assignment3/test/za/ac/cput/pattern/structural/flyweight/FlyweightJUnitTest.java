package za.ac.cput.pattern.structural.flyweight;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Revar
 */

public class FlyweightJUnitTest {

    private static FlyweightFactory flyweightFactory;
    public FlyweightJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        flyweightFactory = FlyweightFactory.getInstance();
    }

    @Test
    public void testFlyweight() {
        for(int i = 0; i < 5; i++) {
            Flyweight flyweightAdder = flyweightFactory.getFlyweight("adder");
            flyweightAdder.doMath(i, i);
            
            Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiplier");
            flyweightMultiplier.doMath(i, i);
        }
    }
}