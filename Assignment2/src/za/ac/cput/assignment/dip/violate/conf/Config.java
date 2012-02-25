package za.ac.cput.assignment.dip.violate.conf;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.dip.violate.model.Employee;
import za.ac.cput.assignment.dip.violate.model.Name;
import za.ac.cput.assignment.dip.violate.service.internal.MockEmployeeReporter;
import za.ac.cput.assignment.dip.violate.service.internal.MockEmployeeRepository;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean
    public MockEmployeeRepository provideMockEmployeeRepository()
    {
        MockEmployeeRepository repository = new MockEmployeeRepository();
        repository.persist(new Employee(9234, new Name("Tom", "Jones"), BigDecimal.valueOf(10000.0)));
        repository.persist(new Employee(2756, new Name("Lucy", "Lu"), BigDecimal.valueOf(5000.0)));
        repository.persist(new Employee(5563, new Name("Katy", "Perry"), BigDecimal.valueOf(25000.0)));
        
        return repository;
    }
    
    @Bean(name="employeeReporter")
    public MockEmployeeReporter provideEmployeeReporter()
    {
        return new MockEmployeeReporter(provideMockEmployeeRepository());
    }
}
