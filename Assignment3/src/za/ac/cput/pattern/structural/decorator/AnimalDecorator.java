package za.ac.cput.pattern.structural.decorator;

/**
 *
 * @author Revar
 */

public abstract class AnimalDecorator implements Animal {
    
    private Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }
    
    public Animal getAnimal() {
        return animal;
    }
}