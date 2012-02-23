package za.ac.cput.assignment.ocp.good.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.ocp.Item;
import za.ac.cput.assignment.ocp.ShoppingCart;
import za.ac.cput.assignment.ocp.good.Biller;
import za.ac.cput.assignment.ocp.good.StoreShoppingCart;
import za.ac.cput.assignment.ocp.good.conf.BillerConfig;

/**
 *
 * @author Zac Blazic
 */

public class GoodOCPJUnitTest
{
    public static ApplicationContext context;
    
    public GoodOCPJUnitTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        context = new AnnotationConfigApplicationContext(BillerConfig.class);
        System.out.println("* Good OCP Tests");
    }

    @Test
    public void testBasicCheckoutBiller() 
    {
        Biller biller = (Biller)context.getBean("basicCheckoutBiller");
        ShoppingCart cart = new StoreShoppingCart(biller);
        cart.add(new Item("GN3949", "Samsung Galaxy Note", 8999, "Dual core android phone"));
        cart.checkout();
    }
    
    @Test
    public void testSuperCheckoutBiller() 
    {
        Biller biller = (Biller)context.getBean("superCheckoutBiller");
        ShoppingCart cart = new StoreShoppingCart(biller);
        cart.add(new Item("GN3949", "Samsung Galaxy Note", 8999, "Dual core android phone"));
        cart.checkout();
    }
    
    @Test
    public void testMockCheckoutBiller() 
    {
        Biller biller = (Biller)context.getBean("mockCheckoutBiller");
        ShoppingCart cart = new StoreShoppingCart(biller);
        cart.add(new Item("GN3949", "Samsung Galaxy Note", 8999, "Dual core android phone"));
        cart.checkout();
    }
}