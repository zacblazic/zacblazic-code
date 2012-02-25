package za.ac.cput.assignment.dip.obey.service.internal;

import java.util.ArrayList;
import java.util.List;
import za.ac.cput.assignment.dip.obey.service.EmployeeRepository;
import za.ac.cput.assignment.dip.obey.model.Employee;

/**
 *
 * @author Zac Blazic
 */

public class MockEmployeeRepository implements EmployeeRepository
{
    private final List<Employee> employees = new ArrayList<Employee>();
    
    public MockEmployeeRepository()
    {
    }
    
    @Override
    public void persist(Employee employee)
    {
        employees.add(employee);
    }
    
    @Override
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
    
    @Override
    public List<Employee> findAll()
    {
        return employees;
    }
}
