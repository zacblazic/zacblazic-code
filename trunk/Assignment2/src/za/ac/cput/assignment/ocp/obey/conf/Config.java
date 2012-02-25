package za.ac.cput.assignment.ocp.obey.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.ocp.obey.service.twitter.internal.MockTwitterService;
import za.ac.cput.assignment.ocp.obey.service.twitter.rest.internal.MockTwitterRestService;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    /*
     * MockTwitterService is now depending on the interface 
     * TwitterRestService. This allows for extensibilty, where 
     * you can provide any TwitterRestService as long as it 
     * agrees to the contract.
     */
    
    @Bean
    public MockTwitterRestService provideTwitterRestService()
    {
        return new MockTwitterRestService();
    }
    
    @Bean(name="twitterService")
    public MockTwitterService provideTwitterService()
    {
        return new MockTwitterService(provideTwitterRestService());
    }
}