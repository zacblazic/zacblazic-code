package za.ac.cput.assignment.lsp.violate.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.lsp.violate.service.internal.MockBirdHandler;

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
}
