package za.ac.cput.assignment.dip.violate.service.internal;

import java.util.ArrayList;
import java.util.List;
import za.ac.cput.assignment.dip.violate.model.Employee;

/**
 *
 * @author Zac Blazic
 */

public class MockEmployeeRepository
{
    private final List<Employee> employees = new ArrayList<Employee>();
    
    public MockEmployeeRepository()
    {
    }
    
    public void persist(Employee employee)
    {
        employees.add(employee);
    }
    
    public Employee findById(long id)
    {
        for(Employee e : employees)
        {
            if(e.getId() == id)
                return e;
        }
        
        // I would rather throw an exception but I'm too lazy for that right now.
        return null;
    }
    
    public List<Employee> findAll()
    {
        return employees;
    }
}
