package za.ac.cput.assignment.dip.violate.model;

import java.math.BigDecimal;

/**
 *
 * @author Zac Blazic
 */

public final class Employee
{
    private final long id;
    private final Name name;
    private BigDecimal salary;
    
    public Employee(long id, Name name, BigDecimal salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public BigDecimal getSalary() 
    {
        return salary;
    }

    public void setSalary(BigDecimal salary) 
    {
        this.salary = salary;
    }
    
    @Override
    public String toString() 
    {
        return name.toString();
    }
}
