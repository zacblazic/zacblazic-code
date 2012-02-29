package za.ac.cput.assignment.adp.obey.model.entity;

/**
 *
 * @author Zac Blazic
 */

public class User
{
    private long id;
    private Name name;
    private FriendList friendList;
    
    public User(long id, Name name, FriendList friendList)
    {
        this.id = id;
        this.name = name;
        this.friendList = friendList;
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
        friendList.add(user);
    }
    
    public boolean isFriendsWith(User user)
    {
        return friendList.contains(user);
    }

    @Override
    public String toString() 
    {
        return "User{" + "id=" + id + ", name=" + name + '}';
    }    
}
