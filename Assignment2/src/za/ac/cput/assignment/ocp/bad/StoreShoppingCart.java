package za.ac.cput.assignment.ocp.bad;

import za.ac.cput.assignment.ocp.Item;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import za.ac.cput.assignment.ocp.ShoppingCart;


/**
 *
 * @author Zac Blazic
 */

public class StoreShoppingCart implements ShoppingCart
{
    private final List<Item> items = new ArrayList<Item>();
    private final CheckoutBiller biller;
    
    public StoreShoppingCart(CheckoutBiller biller)
    {
        this.biller = biller;
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
    public void checkout() 
    {
        double total = 0.0;
        
        for(Item i : items)
        {
            total += i.getPrice();
        }
        
        if(biller.getType().equals("BasicCheckoutBiller"))
        {
            billBasicCheckoutBiller(total);
        }
        else if(biller.getType().equals("SuperCheckoutBiller"))
        {
            billSuperCheckoutBiller(total);
        }
        else if(biller.getType().equals("MockCheckoutBiller"))
        {
            billMockCheckoutBiller(total);
        }
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

    private void billBasicCheckoutBiller(double amount) 
    {
        System.out.println("Initializing basic checkout biller...");
        //Initialize basic checkout biller
        
        biller.bill(amount);
    }

    private void billMockCheckoutBiller(double amount) 
    {
        System.out.println("Initializing mock checkout biller...");
        //Initialize mock checkout biller
        
        biller.bill(amount);
    }

    private void billSuperCheckoutBiller(double amount) 
    {
        System.out.println("Initializing super checkout biller...");
        //Initialize super checkout biller
        
        biller.bill(amount);
    }
}