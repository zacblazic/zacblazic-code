package za.ac.cput.pattern.structural.proxy;

import java.util.Date;

/**
 *
 * @author Revar
 */

public class Car {
    
    public void drive() {
        System.out.println(this.getClass().getSimpleName() 
                           + " begins to drive off @ " + new Date());
    }
}