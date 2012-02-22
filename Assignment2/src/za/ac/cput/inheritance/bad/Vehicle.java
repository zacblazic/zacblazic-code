package za.ac.cput.inheritance.bad;

/**
 *
 * @author Zac Blazic
 */

/*
 * Speed has been declared speed to be protected and thus leaks the 
 * implementation of this class to any class that extends it.
 */
public class Vehicle
{
    private boolean started;
    protected int speed;
    
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
