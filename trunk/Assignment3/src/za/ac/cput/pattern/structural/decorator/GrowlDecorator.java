package za.ac.cput.pattern.structural.decorator;

/**
 *
 * @author Revar
 */

public class GrowlDecorator extends AnimalDecorator {

    public GrowlDecorator(Animal animal) {
        super(animal);
    }
    
    @Override
    public void describe() {
        getAnimal().describe();
        System.out.println("I have a voice box...");
        growl();
    }
    
    public void growl() {
        System.out.println("Grrrrrr...");
    }
}