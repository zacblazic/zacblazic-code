package za.ac.cput.assignment.ocp.good.test;

import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.assignment.ocp.Item;
import za.ac.cput.assignment.ocp.ShoppingCart;
import za.ac.cput.assignment.ocp.good.*;

/**
 *
 * @author Zac Blazic
 */

public class GoodOCPJUnitTest
{
    public GoodOCPJUnitTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        System.out.println("* Good OCP Tests");
    }

    @Test
    public void testBasicCheckoutBiller() 
    {
        /*
         * Not using dependency injection here to simplify the essence of
         * the issue under view.
         */
        
        Biller biller = new BasicCheckoutBiller();
        ShoppingCart cart = new StoreShoppingCart(biller);
        cart.add(new Item("GN3949", "Samsung Galaxy Note", 8999, "Dual core android phone"));
        cart.checkout();
    }
    
    @Test
    public void testSuperCheckoutBiller() 
    {
        /*
         * Not using dependency injection here to simplify the essence of
         * the issue under view.
         */
        
        Biller biller = new SuperCheckoutBiller();
        ShoppingCart cart = new StoreShoppingCart(biller);
        cart.add(new Item("GN3949", "Samsung Galaxy Note", 8999, "Dual core android phone"));
        cart.checkout();
    }
    
    @Test
    public void testMockCheckoutBiller() 
    {
        /*
         * Not using dependency injection here to simplify the essence of
         * the issue under view.
         */
        
        Biller biller = new MockCheckoutBiller();
        ShoppingCart cart = new StoreShoppingCart(biller);
        cart.add(new Item("GN3949", "Samsung Galaxy Note", 8999, "Dual core android phone"));
        cart.checkout();
    }
}