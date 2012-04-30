package za.ac.cput.pattern.structural.bridge;

/**
 *
 * @author Revar
 */

public class SmallCar extends Vehicle {

    public SmallCar(Engine engine) {
        super(engine, 600);
    }
    
    @Override
    public void drive() {
        System.out.println("The big bus is driving...");
        int horsepower = getEngine().go();
        speedReport(horsepower);
    } 
}