package za.ac.cput.assignment.shoppingcart;

import za.ac.cput.assignment.shoppingcart.model.Item;

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
