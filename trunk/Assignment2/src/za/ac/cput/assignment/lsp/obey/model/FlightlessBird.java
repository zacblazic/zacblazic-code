package za.ac.cput.assignment.lsp.obey.model;

/**
 *
 * @author Zac Blazic
 */

public class FlightlessBird
{
    private final String species;
    private final double weight;
    protected boolean running;
    
    public FlightlessBird(String species, double weight)
    {
        this.species = species;
        this.weight = weight;
    }
    
    public void run()
    {
        running = true;
    }
    
    public void rest()
    {
        running = false;
    }
    
    public boolean isRunning() 
    {
        return running;
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
