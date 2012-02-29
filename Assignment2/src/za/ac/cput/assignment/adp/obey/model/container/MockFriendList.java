package za.ac.cput.assignment.adp.obey.model.container;

import java.util.ArrayList;
import java.util.List;
import za.ac.cput.assignment.adp.obey.model.entity.FriendList;
import za.ac.cput.assignment.adp.obey.model.entity.User;

/**
 *
 * @author Zac Blazic
 */

public class MockFriendList implements FriendList
{
    private List<User> friends = new ArrayList<User>();
    
    public MockFriendList()
    {
    }
    
    @Override
    public void add(User user)
    {
        friends.add(user);
    }
    
    @Override
    public boolean contains(User user)
    {
        return friends.contains(user);
    }
}
