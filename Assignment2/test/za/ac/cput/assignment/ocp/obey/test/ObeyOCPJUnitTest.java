package za.ac.cput.assignment.ocp.obey.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.ocp.obey.conf.Config;
import za.ac.cput.assignment.ocp.obey.service.twitter.TwitterService;

/**
 *
 * @author Zac Blazic
 */

public class ObeyOCPJUnitTest
{
    private static ApplicationContext context;
    
    public ObeyOCPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    public void testTweet() 
    {
        /*
         * To see the where the compliance occurs plese see the config file.
         */
        
        TwitterService twitterService = (TwitterService)context.getBean("twitterService");
        String message = "I love coding! #TPG2";
                
        Assert.assertTrue(twitterService.tweet(message));
    }
}