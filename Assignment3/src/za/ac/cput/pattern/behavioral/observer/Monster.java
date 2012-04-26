package za.ac.cput.pattern.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Zac Blazic
 */

public class Monster implements Entity {
    
    private String name;
    private Location location;
    private Set<MovementObserver> movementObservers = new HashSet<MovementObserver>();
    
    public Monster(String name, Location location) {
        this.name = name;
        this.location = location;
    }
    
    @Override
    public void addMovementObserver(MovementObserver movementObserver) {
        movementObservers.add(movementObserver);
    }

    @Override
    public void removeMovementObserver(MovementObserver movementObserver) {
        movementObservers.remove(movementObserver);
    }

    @Override
    public void notifyObservers() {
        for(MovementObserver movementObserver : movementObservers) {
            movementObserver.update(location);
        }
    }
    
    @Override
    public void move(int x, int y) {
        location = new Location(location.getX() + x, location.getY() + y);
        notifyObservers();
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public String getName() {
        return name;
    }
}