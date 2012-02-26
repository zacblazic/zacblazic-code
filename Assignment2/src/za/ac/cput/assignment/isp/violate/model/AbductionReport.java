package za.ac.cput.assignment.isp.violate.model;

/**
 *
 * @author Zac Blazic
 */

public final class AbductionReport
{
    private final int numberOffenses;
    
    public AbductionReport(int numberOffenses)
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
        return "AbductionReport{" + "numberOffenses=" + numberOffenses + '}';
    }
}
