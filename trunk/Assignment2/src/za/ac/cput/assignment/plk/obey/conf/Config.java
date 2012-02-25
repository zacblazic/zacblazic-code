package za.ac.cput.assignment.plk.obey.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.plk.obey.service.internal.MockTrafficService;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean(name="trafficService")
    public MockTrafficService provideTrafficService()
    {
        return new MockTrafficService();
    }
}
