package za.ac.cput.pattern.behavioral.memento;

/**
 *
 * @author Revar
 */

public class DietInfoCaretaker {

    private Object memento;
    
    public void save(DietInfo dietInfo) {
        memento = dietInfo.save();
    }
    
    public void restore(DietInfo dietInfo) {
        dietInfo.restore(memento);
    }
}