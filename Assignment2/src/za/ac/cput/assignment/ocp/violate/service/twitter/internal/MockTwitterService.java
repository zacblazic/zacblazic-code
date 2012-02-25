package za.ac.cput.assignment.ocp.violate.service.twitter.internal;

import za.ac.cput.assignment.ocp.violate.service.twitter.TwitterService;
import za.ac.cput.assignment.ocp.violate.service.twitter.rest.MockTwitterRestService;

/**
 *
 * @author Zac Blazic
 */

public final class MockTwitterService implements TwitterService
{
    private final MockTwitterRestService rest;
    
    public MockTwitterService(MockTwitterRestService rest)
    {
        this.rest = rest;
    }
    
    @Override
    public boolean tweet(String message) 
    {
        if(message.length() > 140)
            throw new IllegalArgumentException();
        
        return rest.postTweet(message);
    }
}
