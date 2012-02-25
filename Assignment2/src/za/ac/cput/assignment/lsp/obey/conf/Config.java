package za.ac.cput.assignment.lsp.obey.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.lsp.obey.service.internal.MockBirdHandler;
import za.ac.cput.assignment.lsp.obey.service.internal.MockFlightlessBirdHandler;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean(name="birdHandler")
    public MockBirdHandler provideBirdHandler()
    {
        return new MockBirdHandler();
    }
    
    @Bean(name="flightlessBirdHandler")
    public MockFlightlessBirdHandler provideFlightlessBirdHandler()
    {
        return new MockFlightlessBirdHandler();
    }
}
