package za.ac.cput.assignment.adp.violate.model.container;

import java.util.ArrayList;
import java.util.List;
import za.ac.cput.assignment.adp.violate.model.entity.User;

/**
 *
 * @author Zac Blazic
 */

public class FriendList
{
    private List<User> friends = new ArrayList<User>();
    
    public FriendList()
    {
    }
    
    public void add(User user)
    {
        friends.add(user);
    }
    
    public boolean contains(User user)
    {
        return friends.contains(user);
    }
}
