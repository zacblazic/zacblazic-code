package za.ac.cput.assignment.adp.obey.service;

import za.ac.cput.assignment.adp.obey.model.entity.User;

/**
 *
 * @author Zac Blazic
 */

public interface FriendHandler
{
    void createBidirectionalFriendship(User user1, User user2);
}
