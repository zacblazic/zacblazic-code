package za.ac.cput.assignment.ocp.obey.service.twitter.internal;

import za.ac.cput.assignment.ocp.obey.service.twitter.TwitterService;
import za.ac.cput.assignment.ocp.obey.service.twitter.rest.TwitterRestService;

/**
 *
 * @author Zac Blazic
 */

public final class MockTwitterService implements TwitterService
{
    private final TwitterRestService rest;
    
    public MockTwitterService(TwitterRestService rest)
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
