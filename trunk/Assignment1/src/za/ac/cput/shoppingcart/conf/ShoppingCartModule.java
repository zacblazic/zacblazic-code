package za.ac.cput.shoppingcart.conf;

import com.google.inject.AbstractModule;
import za.ac.cput.shoppingcart.ShoppingCart;
import za.ac.cput.shoppingcart.internal.StoreShoppingCart;

/**
 *
 * @author Zac Blazic
 */

public class ShoppingCartModule extends AbstractModule
{
    @Override
    protected void configure() 
    {
        bind(ShoppingCart.class).to(StoreShoppingCart.class);
    }
}
