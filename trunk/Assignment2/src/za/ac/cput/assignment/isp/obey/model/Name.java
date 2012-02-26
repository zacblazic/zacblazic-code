package za.ac.cput.assignment.isp.obey.model;

/**
 *
 * @author Zac Blazic
 */

public final class Name
{
    private String firstName;
    private String middleName;
    private String lastName;
    
    public Name()
    {
    }
    
    public Name(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Name(String firstName, String middleName, String lastName)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    
    public String getMiddleName() 
    {
        return middleName;
    }

    public void setMiddleName(String middleName) 
    {
        this.middleName = middleName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    @Override
    public String toString() 
    {
        return "Name{" + "middleName=" + middleName + ", lastName=" + lastName + "}";
    }
}
