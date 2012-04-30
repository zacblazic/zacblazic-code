package za.ac.cput.pattern.structural.decorator;

/**
 *
 * @author Revar
 */

public class LogDecorator extends AnimalDecorator {

    public LogDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        getAnimal().describe();
        System.out.println("I have legs...");
        dance();
    }
    
    public void dance() {
        System.out.println("I can dance...");
    }
}