package za.ac.cput.assignment.adp.violate.service;

import za.ac.cput.assignment.adp.violate.model.entity.User;

/**
 *
 * @author Zac Blazic
 */

public interface FriendHandler
{
    void createBidirectionalFriendship(User user1, User user2);
}
