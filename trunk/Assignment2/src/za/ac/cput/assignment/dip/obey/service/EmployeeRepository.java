package za.ac.cput.assignment.dip.obey.service;

import java.util.List;
import za.ac.cput.assignment.dip.obey.model.Employee;

/**
 *
 * @author Zac Blazic
 */

public interface EmployeeRepository
{
    void persist(Employee employee);
    Employee findById(long id);
    List<Employee> findAll();
}
