package za.ac.cput.assignment.ocp;

/**
 *
 * @author Zac Blazic
 */

public interface ShoppingCart
{
    void add(Item item);
    void remove(String sku);
    Item get(int index);
    int size();
    void clear();
    void checkout();
}
