package za.ac.cput.assignment.adp.obey.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.adp.obey.model.container.MockFriendList;
import za.ac.cput.assignment.adp.obey.service.internal.MockFriendHandler;

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
    
    @Bean(name="friendList")
    public MockFriendList provideFriendList()
    {
        return new MockFriendList();
    }
}
