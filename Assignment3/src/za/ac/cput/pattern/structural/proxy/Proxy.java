package za.ac.cput.pattern.structural.proxy;

import java.util.Date;

/**
 *
 * @author Revar
 */

public class Proxy {
    
    private SlowCar slowCar;
    
    public Proxy() {
        System.out.println("Creating proxy @ " + new Date());
    }
    
    public void sayHello() {
        if(slowCar == null) {
            slowCar = new SlowCar();
        }
        
        slowCar.drive();
    }
}