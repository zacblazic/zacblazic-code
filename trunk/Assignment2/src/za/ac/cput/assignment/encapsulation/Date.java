package za.ac.cput.assignment.encapsulation;

/**
 *
 * @author Zac Blazic
 */

public final class Date 
{   
    private static final String[] months = {"Jan", "Feb", "Mar", "Apr", "May",
                                            "Jun", "Jul", "Aug", "Sep", "Oct",
                                            "Nov", "Dec"};
    private final int day;
    private final int month;
    private final int year;
    
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public boolean isLeapYear()
    {
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
    }
    
    public int getDay()
    {
        return day;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public int getYear()
    {
        return year;
    }
    
    @Override
    public String toString()
    {
        return day + " " + months[month - 1] + " " + year;
    }
}
