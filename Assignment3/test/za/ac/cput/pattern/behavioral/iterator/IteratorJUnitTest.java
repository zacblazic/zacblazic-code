package za.ac.cput.pattern.behavioral.iterator;

import java.util.Iterator;
import org.junit.Test;

/**
 *
 * @author Revar
 */

public class IteratorJUnitTest {

    public IteratorJUnitTest() {
    }

    @Test
    public void testIterator() {
        Item item1 = new Item("Calamari", 27.00f);
        Item item2 = new Item("Fish", 45.00f);
        Item item3 = new Item("Ribs", 89.00f);
        
        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        
        System.out.println("Displaying menu:");
        
        Iterator<Item> iterator1 = menu.iterator();
        
        while(iterator1.hasNext()) {
            Item item = iterator1.next();
            System.out.println("Item: " + item);
        }
        
        System.out.println("Removing last item");
        iterator1.remove();
        
        System.out.println("Displaying menu:");
        
        Iterator<Item> iterator2 = menu.iterator();
        
        while(iterator2.hasNext()) {
            Item item = iterator2.next();
            System.out.println("Item: " + item);
        }
    }
}