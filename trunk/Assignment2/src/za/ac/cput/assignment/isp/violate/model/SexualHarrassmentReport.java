package za.ac.cput.assignment.isp.violate.model;

/**
 *
 * @author Zac Blazic
 */

public final class SexualHarrassmentReport
{
    private final int numberOffenses;

    public SexualHarrassmentReport(int numberOffenses) 
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
        return "SexualHarrassmentReport{" + "numberOffenses=" + numberOffenses + '}';
    }
}
