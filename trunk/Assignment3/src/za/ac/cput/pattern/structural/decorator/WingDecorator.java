package za.ac.cput.pattern.structural.decorator;

/**
 *
 * @author Revar
 */

public class WingDecorator extends AnimalDecorator {

    public WingDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        getAnimal().describe();
        System.out.println("I have wings...");
        fly();
    } 
    
    public void fly() {
        System.out.println("I can fly...");
    }   
}