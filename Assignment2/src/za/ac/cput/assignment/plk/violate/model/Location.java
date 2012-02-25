package za.ac.cput.assignment.plk.violate.model;

/**
 *
 * @author Zac Blazic
 */

public final class Location
{
    private final String road;
    private final String area;
    private final String town;
    
    public Location(String road, String area, String town)
    {
        this.road = road;
        this.area = area;
        this.town = town;
    }
    
    public String getRoad() 
    {
        return road;
    }

    public String getArea() 
    {
        return area;
    }

    public String getTown() 
    {
        return town;
    }

    @Override
    public String toString() 
    {
        return road + ", " + area + ", " + town;
    }
}
