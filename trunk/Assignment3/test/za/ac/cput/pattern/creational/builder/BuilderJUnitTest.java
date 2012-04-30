package za.ac.cput.pattern.creational.builder;

import org.junit.Test;

/**
 *
 * @author Revar
 */

public class BuilderJUnitTest {

    public BuilderJUnitTest() {
    }
    
    @Test
    public void testMealBuilder() {
        MealOrder order = new MealBuilder.Builder("burger").chips("chips")
                                                           .drink("castle")
                                                           .build();
        
        System.out.println("The order has " + order.getBurger());
        System.out.println("The order has " + order.getChips());
        System.out.println("The order has " + order.getDrink());
        System.out.println("The order has " + order.getIcecream());
        System.out.println("The order has " + order.getToy());
    }
}