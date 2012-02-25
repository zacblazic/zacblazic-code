package za.ac.cput.assignment.lsp.obey.model;

/**
 *
 * @author Zac Blazic
 */

public class Bird
{
    private final String species;
    private final double weight;
    protected boolean flying;
    
    public Bird(String species, double weight)
    {
        this.species = species;
        this.weight = weight;
    }
    
    public void fly()
    {
        flying = true;
    }
    
    public void land()
    {
        flying = false;
    }
    
    public boolean isFlying() 
    {
        return flying;
    }
    
    public String getSpecies()
    {
        return species;
    }

    public double getWeight() 
    {
        return weight;
    }
    
    @Override
    public String toString()
    {
        return species + "(" + weight + "kg)";
    }
}
