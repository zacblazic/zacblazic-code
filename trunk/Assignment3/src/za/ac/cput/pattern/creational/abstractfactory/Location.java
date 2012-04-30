/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.abstractfactory;

/**
 *
 * @author 210208880
 */
public class Location {
    
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