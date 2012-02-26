package za.ac.cput.assignment.crp.violate.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.crp.violate.service.internal.MockGarageManager;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean(name="garageManager")
    public MockGarageManager provideGarageManager()
    {
        return new MockGarageManager();
    }    
}
