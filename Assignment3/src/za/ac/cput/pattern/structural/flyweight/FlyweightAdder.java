package za.ac.cput.pattern.structural.flyweight;

/**
 *
 * @author Revar
 */

public class FlyweightAdder implements Flyweight {

    String operation = "Adding";
    
    public FlyweightAdder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.err.println(ie);
        }
    }
    
    @Override
    public void doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + " = " + (a + b));
    }
}