package za.ac.cput.clock.internal;

import za.ac.cput.clock.Clock;

/**
 *
 * @author Zac Blazic
 */

public class DigitalClock implements Clock
{
    private int hours;
    private int minutes;
    private int seconds;
   
    @Override
    public void set(int hours, int minutes, int seconds) 
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        
        normalize();
    }

    @Override
    public void add(int hours, int minutes, int seconds) 
    {
        this.hours += hours;
        this.minutes += minutes;
        this.seconds += seconds;
        
        normalize();
    }

    @Override
    public void increment() 
    {
        hours++;
        minutes++;
        seconds++;
        
        normalize();
    }
    
    @Override
    public int getHours() 
    {
        return hours;
    }

    @Override
    public int getMinutes() 
    {
        return minutes;
    }

    @Override
    public int getSeconds() 
    {
        return seconds;
    }

    @Override
    public void reset() 
    {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    private void normalize() 
    {
        while(seconds >= 60)
        {
            seconds -= 60;
            minutes++;
        }
        
        while(minutes >= 60)
        {
            minutes -= 60;
            hours++;
        }
        
        if(hours >= 24)
        {
            hours = 0;
        }
    }
}
