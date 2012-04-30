package za.ac.cput.pattern.structural.flyweight;

/**
 *
 * @author Revar
 */

public class FlyweightMultiplier implements Flyweight {

    String operation = "Multiplying";
    
    public FlyweightMultiplier() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.err.println(ie);
        }
    }
    
    @Override
    public void doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + " = " + a * b);
    }   
}