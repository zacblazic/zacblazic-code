package za.ac.cput.assignment.oo.polymorphism.model;

/**
 *
 * @author Zac Blazic
 */

public class Bulb
{
    private final int wattageRating;
    
    public Bulb(int wattageRating)
    {
        this.wattageRating = wattageRating;
    }
    
    public int getWattageRating()
    {
        return wattageRating;
    }
    
    @Override
    public String toString()
    {
        return wattageRating + "W bulb";
    }
}
