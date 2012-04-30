package za.ac.cput.pattern.behavioral.iterator;

/**
 *
 * @author Zac Blazic
 */

public class Item {

    private String name;
    private float price;
    
    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name + ": R" + price;
    }
}