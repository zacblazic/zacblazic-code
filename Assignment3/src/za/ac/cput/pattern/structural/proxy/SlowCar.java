package za.ac.cput.pattern.structural.proxy;

/**
 *
 * @author Revar
 */

public class SlowCar extends Car {
     
    public SlowCar() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.err.println(ie);
        }
    }
}