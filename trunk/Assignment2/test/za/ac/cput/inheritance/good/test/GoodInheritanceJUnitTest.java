package za.ac.cput.inheritance.good.test;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.inheritance.good.Car;

/**
 *
 * @author Zac Blazic
 */

public class GoodInheritanceJUnitTest
{
    public GoodInheritanceJUnitTest()
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