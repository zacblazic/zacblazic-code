package za.ac.cput.pattern.structural.proxy;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Revar
 */

public class ProxyJUnitTest {
    
    private static Proxy proxy;
    
    public ProxyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        proxy = new Proxy();
    }

    @Test
    public void testProxy() {
        
        FastCar fastCar = new FastCar();
        fastCar.drive();
        
        proxy.sayHello();
    }
}