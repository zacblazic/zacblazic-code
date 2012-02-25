package za.ac.cput.assignment.oo.polymorphism.model;

/**
 *
 * @author Zac Blazic
 */

public final class CompactFluorescentBulb extends Bulb
{
    public CompactFluorescentBulb(int wattageRating)
    {
        super(wattageRating);
    }
    
    @Override
    public String toString()
    {
        return super.getWattageRating() + "W compact fluorescent bulb";
    }
}
