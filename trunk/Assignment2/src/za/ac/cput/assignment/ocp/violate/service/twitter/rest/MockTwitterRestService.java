package za.ac.cput.assignment.ocp.violate.service.twitter.rest;

/**
 *
 * @author Zac Blazic
 */

public final class MockTwitterRestService
{
    public boolean postTweet(String message)
    {
        /*
         * Do post
         */
        
        System.out.println("Posting tweet: " + message);
        
        return true;
    }
}
