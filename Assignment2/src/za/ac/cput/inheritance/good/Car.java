package za.ac.cput.inheritance.good;

/**
 *
 * @author Zac Blazic
 */

public class Car
{
    private static final int tireSpeedRating = 220;
    private static final int tireSpeedMargin = 10;
    private Vehicle vehicle;
    
    public Car()
    {
        vehicle = new Vehicle();
    }
    
    public void start()
    {
        vehicle.start();
    }
    
    public void stop()
    {
        vehicle.stop();
    }
    
    public boolean isStarted()
    {
        return vehicle.isStarted();
    }
    
    public void increaseSpeed(int amount)
    {
        vehicle.increaseSpeed(amount);
    }
    
    public void decreaseSpeed(int amount)
    {
        vehicle.decreaseSpeed(amount);
    }
    
    public int getSpeed()
    {
        return vehicle.getSpeed();
    }
    
    public void governSpeed()
    {
        while(getSpeed() > (tireSpeedRating - tireSpeedMargin))
        {
            decreaseSpeed(tireSpeedMargin);
            System.out.println("Speed governed to: " + getSpeed());
        }
    }
    
    public int getTireSpeedRating()
    {
        return tireSpeedRating;
    }
}
