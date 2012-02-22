package za.ac.cput.inheritance.bad;

/**
 *
 * @author Zac Blazic
 */

public class Car extends Vehicle
{
    private static final int tireSpeedRating = 220;
    private static final int tireSpeedMargin = 10;
    
    public Car()
    {
    }
    
    public void governSpeed()
    {
        while(speed > (tireSpeedRating - tireSpeedMargin))
        {
            decreaseSpeed(tireSpeedMargin);
            System.out.println("Speed governed to: " + speed);
        }
    }
    
    public int getTireSpeedRating()
    {
        return tireSpeedRating;
    }
}
