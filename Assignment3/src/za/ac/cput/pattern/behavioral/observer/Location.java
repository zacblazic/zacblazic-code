package za.ac.cput.pattern.behavioral.observer;

/**
 *
 * @author Zac Blazic
 */

public final class Location {
    
    private final int x;
    private final int y;
    
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}