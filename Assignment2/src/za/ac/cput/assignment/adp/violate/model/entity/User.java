package za.ac.cput.assignment.adp.violate.model.entity;

import za.ac.cput.assignment.adp.violate.model.container.FriendList;

/**
 *
 * @author Zac Blazic
 */

public class User
{
    private long id;
    private Name name;
    private FriendList friends = new FriendList();
    
    public User(long id, Name name)
    {
        this.id = id;
        this.name = name;
    }

    public long getId() 
    {
        return id;
    }

    public void setId(long id) 
    {
        this.id = id;
    }

    public Name getName() 
    {
        return name;
    }

    public void setName(Name name) 
    {
        this.name = name;
    }
    
    public void addFriend(User user)
    {
        friends.add(user);
    }
    
    public boolean isFriendsWith(User user)
    {
        return friends.contains(user);
    }

    @Override
    public String toString() 
    {
        return "User{" + "id=" + id + ", name=" + name + '}';
    }    
}
