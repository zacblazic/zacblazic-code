package za.ac.cput.inheritance.bad.test;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.inheritance.bad.Car;

/**
 *
 * @author Zac Blazic
 */

public class BadInheritanceJUnitTest
{
    public BadInheritanceJUnitTest()
    {
    }

    @Test
    public void testStart() 
    {
        Car car = new Car();
        car.start();
        car.increaseSpeed(400);
        car.governSpeed();
        
        Assert.assertTrue(car.getSpeed() < car.getTireSpeedRating());
    }
}