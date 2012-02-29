package za.ac.cput.assignment.adp.violate.service.internal;

import za.ac.cput.assignment.adp.violate.model.entity.User;
import za.ac.cput.assignment.adp.violate.service.FriendHandler;

/**
 *
 * @author Zac Blazic
 */

public class MockFriendHandler implements FriendHandler
{
    @Override
    public void createBidirectionalFriendship(User user1, User user2) 
    {
        user1.addFriend(user2);
        user2.addFriend(user1);
    }
}
