package za.ac.cput.assignment.dip.violate.service.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import za.ac.cput.assignment.dip.violate.model.Employee;
import za.ac.cput.assignment.dip.violate.model.EmployeeSalaryReport;
import za.ac.cput.assignment.dip.violate.service.EmployeeReporter;

/**
 *
 * @author Zac Blazic
 */

public class MockEmployeeReporter implements EmployeeReporter
{
    private final MockEmployeeRepository employeeRepository;
    
    public MockEmployeeReporter(MockEmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }
    
    @Override
    public EmployeeSalaryReport generateSalaryReport() 
    {
        List<Employee> employees = employeeRepository.findAll();
        
        BigDecimal highestSalary = employees.get(0).getSalary();
        BigDecimal lowestSalary = employees.get(0).getSalary();
        BigDecimal total = BigDecimal.valueOf(0.0);
        BigDecimal averageSalary;
        
        for(Employee e : employees)
        {
            if(e.getSalary().compareTo(highestSalary) == 1)
            {
                highestSalary = e.getSalary();
            }
            
            if(e.getSalary().compareTo(lowestSalary) == -1)
            {
                lowestSalary = e.getSalary();
            }
                
            total = total.add(e.getSalary());
        }
        
        averageSalary = total.divide(BigDecimal.valueOf(employees.size()), RoundingMode.HALF_UP);
        
        return new EmployeeSalaryReport(employees.size(), highestSalary, lowestSalary, averageSalary);
    }
}
