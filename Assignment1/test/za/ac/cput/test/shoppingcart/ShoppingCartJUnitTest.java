package za.ac.cput.test.shoppingcart;

import com.google.inject.Guice;
import com.google.inject.Injector;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.shoppingcart.ShoppingCart;
import za.ac.cput.shoppingcart.conf.ShoppingCartModule;
import za.ac.cput.shoppingcart.model.Item;

/**
 *
 * @author Zac Blazic
 */

public class ShoppingCartJUnitTest 
{
    private static Injector injector;
    
    public ShoppingCartJUnitTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        injector = Guice.createInjector(new ShoppingCartModule());
    }

    @Test
    public void testAdd() 
    {
        ShoppingCart cart = injector.getInstance(ShoppingCart.class);
        Item item = new Item("AB123", "Apple MacBook Pro", 9999.0, "A full featured laptop");
        cart.add(item);
        
        //No defensive copying is needed for immutable object
        Assert.assertSame(item, cart.get(0));
        Assert.assertEquals(item, cart.get(0));
    }
    
    @Test
    public void testRemove() 
    {
        ShoppingCart cart = injector.getInstance(ShoppingCart.class);
        cart.add(new Item("CD456", "Apple iPad", 4999.0, "A state of the art tablet"));
        cart.add(new Item("EF789", "Apple iPod Nano", 999.0, "A music small player"));
        cart.add(new Item("GH012", "Apple iPod Shuffle", 879.0, "A music tiny player"));
        cart.remove("CD456");
        
        Assert.assertEquals(2, cart.size());
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testRemoveException()
    {
        ShoppingCart cart = injector.getInstance(ShoppingCart.class);
        Item item = cart.get(5);
    }
    
    @Test
    public void testCheckout() 
    {
        ShoppingCart cart = injector.getInstance(ShoppingCart.class);
        cart.add(new Item("CD456", "Apple iPad", 4999.0, "A state of the art tablet"));
        cart.add(new Item("EF789", "Apple iPod Nano", 999.0, "A music small player"));
        cart.add(new Item("GH012", "Apple iPod Shuffle", 879.0, "A music tiny player"));
        
        Assert.assertEquals(3, cart.size());
        Assert.assertEquals(6877.0, cart.checkout(), 0);
    }
}