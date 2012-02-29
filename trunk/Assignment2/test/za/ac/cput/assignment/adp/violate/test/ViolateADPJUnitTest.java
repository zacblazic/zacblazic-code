package za.ac.cput.assignment.adp.violate.test;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.adp.violate.conf.Config;
import za.ac.cput.assignment.adp.violate.model.entity.Name;
import za.ac.cput.assignment.adp.violate.model.entity.User;
import za.ac.cput.assignment.adp.violate.service.FriendHandler;

/**
 *
 * @author Zac Blazic
 */

public class ViolateADPJUnitTest
{
    private static ApplicationContext context;
    
    public ViolateADPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }
    
    /*
     * User is dependent on FriendList in order to hold the user's friends.
     * However, FriendList is dependent on User because friends are just Users.
     * Since these two classes are found in different packages they form a cycle
     * which violates the Acyclic Dependencies Principle. It can also be seen
     * as a recursive relationship.
     */

    @Test
    public void testAddFriend()
    {
        User john = new User(1, new Name("John", "Smith"));
        User mary = new User(2, new Name("Mary", "Lovett"));
        FriendHandler handler = (FriendHandler)context.getBean("friendHandler");
        handler.createBidirectionalFriendship(john, mary);
        
        Assert.assertTrue(john.isFriendsWith(mary));
        Assert.assertTrue(mary.isFriendsWith(john));
    }
}