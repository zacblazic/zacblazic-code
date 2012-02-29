package za.ac.cput.assignment.adp.obey.test;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.adp.obey.conf.Config;
import za.ac.cput.assignment.adp.obey.model.entity.FriendList;
import za.ac.cput.assignment.adp.obey.model.entity.Name;
import za.ac.cput.assignment.adp.obey.model.entity.User;
import za.ac.cput.assignment.adp.obey.service.FriendHandler;

/**
 *
 * @author Zac Blazic
 */

public class ObeyADPJUnitTest
{
    private static ApplicationContext context;
    
    public ObeyADPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }
    
    /*
     * In order to remove the cycle, I have created an interface for FriendList
     * in the package that contains User. The implementation in the other package
     * then simply implements this interface. There is now only one dependency
     * from the the container package to the entity package. The interface also
     * makes the User class easy to test with mocks.
     */

    @Test
    public void testAddFriend()
    {
        User john = new User(1, new Name("John", "Smith"), (FriendList)context.getBean("friendList"));
        User mary = new User(2, new Name("Mary", "Lovett"),(FriendList)context.getBean("friendList"));
        FriendHandler handler = (FriendHandler)context.getBean("friendHandler");
        handler.createBidirectionalFriendship(john, mary);
        
        Assert.assertTrue(john.isFriendsWith(mary));
        Assert.assertTrue(mary.isFriendsWith(john));
    }
}