package za.ac.cput.assignment.isp.violate.model;

/**
 *
 * @author Zac Blazic
 */

public final class Crime
{
    private final Date date;
    private final Location location;
    private final String category;
    
    public Crime(Date date, Location location, String category)
    {
        this.date = date;
        this.location = location;
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }

    public Date getDate() 
    {
        return date;
    }

    public Location getLocation() 
    {
        return location;
    }

    @Override
    public String toString() 
    {
        return "Crime{" + "date=" + date + ", location=" + location + ", category=" + category + '}';
    }
}
