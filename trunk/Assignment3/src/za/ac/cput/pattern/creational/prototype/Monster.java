/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.prototype;

/**
 *
 * @author 210208880
 */
public class Monster implements Prototype {
    
    private String name;
    
    public Monster(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public Prototype cloneInstance() {
        return new Monster(name);
    }
    
    @Override
    public String toString() {
        return name;
    }
}