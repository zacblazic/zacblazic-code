package za.ac.cput.assignment.srp.obey.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.srp.obey.service.internal.MockStudentRepository;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean(name="studentRepository")
    public MockStudentRepository provideStudentRepository()
    {
        return new MockStudentRepository();
    }
}
