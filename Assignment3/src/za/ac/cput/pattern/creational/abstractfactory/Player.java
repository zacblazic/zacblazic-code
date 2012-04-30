/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.abstractfactory;

/**
 *
 * @author 210208880
 */
public class Player implements Entity {
    
    private Location location;
    
    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }
}
