package za.ac.cput.pattern.structural.bridge;

/**
 *
 * @author Revar
 */

public abstract class Vehicle {
    
    private Engine engine;
    private int weight;
    
    public Vehicle(Engine engine, int weight) {
        this.engine = engine;
        this.weight = weight;
    }
    
    public abstract void drive();
    
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public void speedReport(int horsepower) {
        int ratio = weight / horsepower;
        
        if(ratio < 3) {
            System.out.println("The vehicle is going at a fast speed");
        } else if(ratio >= 3 && ratio < 8) {
            System.out.println("The vehicle is going at an average speed");
        } else {
            System.out.println("The vehicle is going at a fast speed");
        }
    }
}