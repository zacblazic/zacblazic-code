package za.ac.cput.pattern.structural.decorator;

/**
 *
 * @author Revar
 */

public class LivingAnimal implements Animal {

    @Override
    public void describe() {
        System.out.println("I am an animal...");
    }
}