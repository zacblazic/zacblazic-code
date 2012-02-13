package za.ac.cput.shoppingcart.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import za.ac.cput.shoppingcart.ShoppingCart;
import za.ac.cput.shoppingcart.model.Item;

/**
 *
 * @author Zac Blazic
 */

public class StoreShoppingCart implements ShoppingCart
{
    private final List<Item> items = new ArrayList<Item>();
    
    public StoreShoppingCart()
    {
    }
    
    @Override
    public void add(Item item) 
    {
        if(item == null)
        {
            return;
        }
        
        items.add(item);
    }

    @Override
    public void remove(String sku) 
    {
        Iterator<Item> iterator = items.iterator();
        
        while(iterator.hasNext())
        {
            Item item = iterator.next();
            
            if(item.getSku().equals(sku))
            {
                iterator.remove();
            }
        }
    }
    
    @Override
    public Item get(int index)
    {
        if(index < 0 || index >= items.size())
        {
            throw new IllegalArgumentException();
        }
        
        return items.get(index);
    }

    @Override
    public double checkout() 
    {
        double total = 0.0;
        
        for(Item i : items)
        {
            total += i.getPrice();
        }
        
        return total;
    }

    @Override
    public int size() 
    {
        return items.size();
    }

    @Override
    public void clear() 
    {
        items.clear();
    }
}
