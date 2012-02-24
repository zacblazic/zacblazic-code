package za.ac.cput.assignment.oo.inheritance.model;

/**
 *
 * @author Zac Blazic
 */

public final class Date
{
    private final int day;
    private final int month;
    private final int year;
    
    public Date(int day, int month, int year)
    {
        if(day < 1 || day > 31)
            throw new IllegalArgumentException();
        
        if(month < 1 || month > 12)
            throw new IllegalArgumentException();
        
        this.day = day;
        this.month = month;
        this.year = year;
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
        String output = "";
        
        if(day < 10)
            output = "0";
        
        output += day + "/";
        
        if(month < 10)
            output += "0";
      
        output += month + "/" + year;
        
        return output;
    }
}
