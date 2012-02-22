package za.ac.cput.assignment.ocp.bad.test;

import org.junit.*;
import static org.junit.Assert.*;
import za.ac.cput.assignment.ocp.ShoppingCart;
import za.ac.cput.assignment.ocp.bad.CheckoutBiller;
import za.ac.cput.assignment.ocp.Item;
import za.ac.cput.assignment.ocp.bad.StoreShoppingCart;

/**
 *
 * @author Zac Blazic
 */

public class BadOCPJUnitTest
{
    public BadOCPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        System.out.println("* Bad OCP Tests");
    }

    @Test
    public void testBasicCheckoutBiller() 
    {
        /*
         * Not using dependency injection here to simplify the essence of
         * the issue under view.
         */
        
        CheckoutBiller biller = new CheckoutBiller("BasicCheckoutBiller");
        ShoppingCart cart = new StoreShoppingCart(biller);
        cart.add(new Item("SX100", "Samsung HDTV", 7999, "Full 1080p television"));
        cart.checkout();
    }
    
    @Test
    public void testSuperCheckoutBiller() 
    {
        /*
         * Not using dependency injection here to simplify the essence of
         * the issue under view.
         */
        
        CheckoutBiller biller = new CheckoutBiller("SuperCheckoutBiller");
        ShoppingCart cart = new StoreShoppingCart(biller);
        cart.add(new Item("SX100", "Samsung HDTV", 7999, "Full 1080p television"));
        cart.checkout();
    }
    
    @Test
    public void testMockCheckoutBiller() 
    {
        /*
         * Not using dependency injection here to simplify the essence of
         * the issue under view.
         */
        
        CheckoutBiller biller = new CheckoutBiller("MockCheckoutBiller");
        ShoppingCart cart = new StoreShoppingCart(biller);
        cart.add(new Item("SX100", "Samsung HDTV", 7999, "Full 1080p television"));
        cart.checkout();
    }
}