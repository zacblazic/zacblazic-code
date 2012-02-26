package za.ac.cput.assignment.isp.violate.conf;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.isp.violate.model.*;
import za.ac.cput.assignment.isp.violate.service.crud.internal.MockCriminalRepository;
import za.ac.cput.assignment.isp.violate.service.report.internal.MockCrimeReporter;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean
    public Criminal provideCriminal()
    {
        List<Crime> crimes = new ArrayList<Crime>();
        Crime sexualHarrassment = new Crime(new Date(1, 5, 2011), new Location("West Coast Road", "Table View", "Cape Town"), "Sexual Harrassment");
        Crime autoTheft = new Crime(new Date(1, 5, 2011), new Location("West Coast Road", "Table View", "Cape Town"), "Auto Theft");
        Crime abduction = new Crime(new Date(1, 5, 2011), new Location("West Coast Road", "Table View", "Cape Town"), "Abduction");
        crimes.add(sexualHarrassment);
        crimes.add(autoTheft);
        crimes.add(abduction);
         
        return new Criminal(3443, new Name("Tom", "Bartin"), crimes);
    }
    
    @Bean
    public MockCriminalRepository provideCriminalRepository()
    {
        MockCriminalRepository repository = new MockCriminalRepository();
        
        repository.persist(provideCriminal());
        
        return repository;
    }
    
    @Bean(name="crimeReporter")
    public MockCrimeReporter provideCrimeReporter()
    {
        return new MockCrimeReporter(provideCriminalRepository());
    }
}
