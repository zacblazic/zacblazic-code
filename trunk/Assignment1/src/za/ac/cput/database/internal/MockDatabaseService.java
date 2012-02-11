package za.ac.cput.database.internal;

import java.util.Map;
import za.ac.cput.database.DatabaseService;
import za.ac.cput.database.exception.NoSuchUserException;
import za.ac.cput.database.model.User;

/**
 *
 * @author Zac Blazic
 */

public class MockDatabaseService implements DatabaseService
{
    private final Map<String, User> users;
    
    public MockDatabaseService(Map<String, User> users)
    {
        this.users = users;
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
