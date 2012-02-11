package za.ac.cput.shoppingcart;

import za.ac.cput.shoppingcart.model.Item;

/**
 *
 * @author Zac Blazic
 */

public interface ShoppingCart 
{
    void add(Item item);
    void remove(String sku);
    Item get(int index);
    double checkout();
    int size();
    void clear();
}
