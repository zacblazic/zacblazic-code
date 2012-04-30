package za.ac.cput.pattern.structural.bridge;

/**
 *
 * @author Revar
 */

public class SmallEngine implements Engine {

    int horsepower;
    
    public SmallEngine() {
        horsepower = 100;
    }
    
    @Override
    public int go() {
        System.out.println("THe small engine is running...");
        return horsepower;
    }
}