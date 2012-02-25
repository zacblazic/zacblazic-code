package za.ac.cput.assignment.srp.violate.model;

import java.util.Map;

/**
 *
 * @author Zac Blazic
 */

public final class Student
{
    private final long id;
    private final Name name;
    private final Map<Long, Student> students;
    
    public Student(long id, Name name, Map<Long, Student> students)
    {
        this.id = id;
        this.name = name;
        this.students = students;
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
    
    public void persist()
    {
        students.put(id, this);
    }
    
    public Student find()
    {
        return students.get(id);
    }
    
    @Override
    public String toString()
    {
        return name.toString();
    }
}
