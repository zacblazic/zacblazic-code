package za.ac.cput.assignment.srp.obey.model;

/**
 *
 * @author Zac Blazic
 */

public final class Student
{
    private final long id;
    private final Name name;
    
    public Student(long id, Name name)
    {
        this.id = id;
        this.name = name;
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
    
    @Override
    public String toString()
    {
        return name.toString();
    }
}
