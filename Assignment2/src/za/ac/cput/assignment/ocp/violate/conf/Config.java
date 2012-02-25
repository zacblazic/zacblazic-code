package za.ac.cput.assignment.ocp.violate.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.ocp.violate.service.twitter.internal.MockTwitterService;
import za.ac.cput.assignment.ocp.violate.service.twitter.rest.MockTwitterRestService;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean(name="twitterService")
    public MockTwitterService provideTwitterService()
    {
        /*
         * MockTwitterService is depending upon a concrete class.
         * If you want to change the implementation of it, you
         * need to modify it.
         */
        MockTwitterRestService twitterRestService = new MockTwitterRestService();
        return new MockTwitterService(twitterRestService);
    }
}
