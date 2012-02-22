package za.ac.cput.assignment.ocp;

/**
 *
 * @author Zac Blazic
 */

public final class Item 
{
    private final String sku;
    private final String title;
    private final double price;
    private final String description;
    
    public Item(String sku, String title, double price, String description)
    {
        this.sku = sku;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getSku() 
    {
        return sku;
    }

    public String getTitle() 
    {
        return title;
    }

    public double getPrice() 
    {
        return price;
    }
    
    public String getDescription() 
    {
        return description;
    }
}
