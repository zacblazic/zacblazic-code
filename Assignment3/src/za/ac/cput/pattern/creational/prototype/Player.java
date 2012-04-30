/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.prototype;

/**
 *
 * @author 210208880
 */
public class Player implements Prototype {
    
    private String name;
    
    public Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public Prototype cloneInstance() {
        return new Player(name);
    }  
    
    @Override
    public String toString() {
        return name;
    }
}
