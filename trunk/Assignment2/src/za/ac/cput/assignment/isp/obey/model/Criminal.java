package za.ac.cput.assignment.isp.obey.model;

import java.util.List;

/**
 *
 * @author Zac Blazic
 */

public class Criminal
{
    private final long id;
    private final Name name;
    private final List<Crime> record;
    
    public Criminal(long id, Name name, List<Crime> record)
    {
        this.id = id;
        this.name = name;
        this.record = record;
    }

    public long getId() 
    {
        return id;
    }
    
    public void setMiddleName(String middleName) 
    {
        name.setMiddleName(middleName);
    }

    public void setLastName(String lastName) 
    {
        name.setLastName(lastName);
    }

    public void setFirstName(String firstName) 
    {
        name.setFirstName(firstName);
    }

    public String getMiddleName() 
    {
        return name.getMiddleName();
    }

    public String getLastName() 
    {
        return name.getLastName();
    }

    public String getFirstName() 
    {
        return name.getFirstName();
    }
    
    public List<Crime> getRecord()
    {
        return record;
    }
    
    @Override
    public String toString() 
    {
        return name.toString();
    }
}
