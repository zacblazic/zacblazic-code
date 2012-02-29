package za.ac.cput.assignment.adp.violate.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.adp.violate.service.internal.MockFriendHandler;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean(name="friendHandler")
    public MockFriendHandler provideFriendHandler()
    {
        return new MockFriendHandler();
    }
}
