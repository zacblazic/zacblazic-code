package za.ac.cput.pattern.structural.decorator;

import org.junit.Test;

/**
 *
 * @author Revar
 */

public class DecoratorJUnitTest {

    public DecoratorJUnitTest() {
    }

    @Test
    public void testDecorator() {
        Animal animal = new LivingAnimal();
        animal.describe();
        
        animal = new LogDecorator(animal);
        animal.describe();
        
        animal = new WingDecorator(animal);
        animal.describe();
        
        animal = new GrowlDecorator(animal);
        animal.describe();
    }
}