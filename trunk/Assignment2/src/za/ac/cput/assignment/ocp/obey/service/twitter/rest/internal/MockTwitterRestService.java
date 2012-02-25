package za.ac.cput.assignment.ocp.obey.service.twitter.rest.internal;

import za.ac.cput.assignment.ocp.obey.service.twitter.rest.TwitterRestService;

/**
 *
 * @author Zac Blazic
 */

public final class MockTwitterRestService implements TwitterRestService
{
    @Override
    public boolean postTweet(String message) 
    {
        /*
         * Do post
         */
        
        System.out.println("Posting tweet: " + message);
        
        return true;
    }
}
