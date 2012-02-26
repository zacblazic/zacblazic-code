package za.ac.cput.assignment.isp.violate.model;

/**
 *
 * @author Zac Blazic
 */

public final class AutoTheftReport
{
    private final int numberOffenses;

    public AutoTheftReport(int numberOffenses) 
    {
        this.numberOffenses = numberOffenses;
    }

    public int getNumberOffenses() 
    {
        return numberOffenses;
    }

    @Override
    public String toString() 
    {
        return "AutoTheftReport{" + "numberOffenses=" + numberOffenses + '}';
    }   
}
