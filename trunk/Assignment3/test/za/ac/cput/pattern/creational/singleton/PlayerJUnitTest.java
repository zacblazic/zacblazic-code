package za.ac.cput.pattern.creational.singleton;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Zac Blazic
 */

public class PlayerJUnitTest {
    
    public PlayerJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Test
    public void testInstanceNotNull() {
        Player initialPlayer = Player.getInstance();
        Assert.assertNotNull(initialPlayer);
    }
    
    @Test
    public void testIsSameInstances() {
        Player initialPlayer = Player.getInstance();
        Player otherPlayer = Player.getInstance();
        Assert.assertEquals(initialPlayer, otherPlayer);
    }
}