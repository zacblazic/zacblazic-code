package za.ac.cput.assignment.oo.polymorphism.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.oo.polymorphism.service.internal.MockLightingService;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean(name="lightingService")
    public MockLightingService provideLightingService()
    {
        return new MockLightingService();
    }
}
