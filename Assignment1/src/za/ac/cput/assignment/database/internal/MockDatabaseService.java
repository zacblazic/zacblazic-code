package za.ac.cput.assignment.database.internal;

import java.util.HashMap;
import java.util.Map;
import za.ac.cput.assignment.database.DatabaseService;
import za.ac.cput.assignment.database.exception.NoSuchUserException;
import za.ac.cput.assignment.database.model.User;

/**
 *
 * @author Zac Blazic
 */

public class MockDatabaseService implements DatabaseService
{
    private final Map<String, User> users = new HashMap<String, User>();
    
    public MockDatabaseService()
    {
    }
    
    @Override
    public void addUser(String username, String password)
    {
        users.put(username, new User(username, password));
    }
    
    @Override
    public User getUser(String username) throws NoSuchUserException 
    {
        if(users.containsKey(username))
        {
            return users.get(username);
        }
        else
        {
            throw new NoSuchUserException();
        }
    }
}
