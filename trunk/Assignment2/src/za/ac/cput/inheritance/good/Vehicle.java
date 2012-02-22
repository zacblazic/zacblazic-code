package za.ac.cput.inheritance.good;

/**
 *
 * @author Zac Blazic
 */

public class Vehicle
{
    private boolean started;
    private int speed;
    
    public Vehicle()
    {
    }
    
    public void start()
    {
        started = true;
    }
    
    public void stop()
    {
        if(speed != 0)
        {
            decreaseSpeed(0);
        }
        
        started = false;
    }
    
    public boolean isStarted()
    {
        return started;
    }
    
    public void increaseSpeed(int amount)
    {
        speed += amount;
    }
    
    public void decreaseSpeed(int amount)
    {
        speed -= amount;
    }
    
    public int getSpeed()
    {
        return speed;
    }
}
