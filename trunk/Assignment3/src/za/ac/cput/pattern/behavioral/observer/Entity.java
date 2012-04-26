package za.ac.cput.pattern.behavioral.observer;

/**
 *
 * @author Zac Blazic
 */

public interface Entity {
    
    public void addMovementObserver(MovementObserver movementObserver);
    public void removeMovementObserver(MovementObserver movementObserver);
    public void notifyObservers();
    public String getName();
    public Location getLocation();
    public void move(int x, int y);
}