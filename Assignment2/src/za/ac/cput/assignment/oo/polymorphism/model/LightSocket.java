package za.ac.cput.assignment.oo.polymorphism.model;

/**
 *
 * @author Zac Blazic
 */

public final class LightSocket
{
    private final int wattageRating;
    private Bulb bulb;
    
    public LightSocket(int wattageRating)
    {
        this.wattageRating = wattageRating;
    }
    
    public int getWattageRating()
    {
        return wattageRating;
    }
    
    public void setBulb(Bulb bulb)
    {
        this.bulb = bulb;
    }
    
    public Bulb getBulb()
    {
        return bulb;
    }
    
    @Override
    public String toString()
    {
        return wattageRating + "W light socket";
    }
}
