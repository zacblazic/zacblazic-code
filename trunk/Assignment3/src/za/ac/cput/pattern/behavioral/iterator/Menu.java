package za.ac.cput.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Revar
 */

public class Menu {

    List<Item> items = new ArrayList<Item>();
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }
    
    public Iterator<Item> iterator() {
        return new MenuIterator();
    }
    
    class MenuIterator implements Iterator<Item> {
        
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if(currentIndex < items.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Item next() {
            return items.get(currentIndex++);
        }

        @Override
        public void remove() {
            items.remove(--currentIndex);
        }
    }
}