package za.ac.cput.pattern.structural.bridge;

/**
 *
 * @author Revar
 */

public class BigBus extends Vehicle {
    
    private Engine engine;
    
    public BigBus(Engine engine) {
        super(engine, 600);
    }
    
    @Override
    public void drive() {
        System.out.println("The big bus is driving...");
        int horsepower = getEngine().go();
        speedReport(horsepower);
    } 
}