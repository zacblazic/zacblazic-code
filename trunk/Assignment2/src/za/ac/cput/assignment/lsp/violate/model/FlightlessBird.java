package za.ac.cput.assignment.lsp.violate.model;

/**
 *
 * @author Zac Blazic
 */

public class FlightlessBird extends Bird
{
    public FlightlessBird(String species, double weight)
    {
        super(species, weight);
    }
    
    @Override
    public void fly()
    {
        /*
         * FlightlessBird's cannot fly.
         */
    }
    
    @Override
    public void land()
    {
        /*
         * If you can't fly you can't land.
         */
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}
