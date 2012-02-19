package za.ac.cput.assignment.login.internal;

import com.google.inject.Inject;
import za.ac.cput.assignment.database.DatabaseService;
import za.ac.cput.assignment.database.exception.NoSuchUserException;
import za.ac.cput.assignment.database.model.User;
import za.ac.cput.assignment.login.LoginService;
import za.ac.cput.assignment.login.exception.InvalidPasswordException;

/**
 *
 * @author Zac Blazic
 */

public class StoreLoginService implements LoginService
{
    private final DatabaseService databaseService;
    
    @Inject
    public StoreLoginService(DatabaseService databaseService)
    {
        this.databaseService = databaseService;
    }
    
    @Override
    public void login(String username, String password) throws NoSuchUserException, InvalidPasswordException
    {
        User user = databaseService.getUser(username);
        
        if(user.getPassword().equals(password))
        {
            user.setLoggedIn(true);
        }
        else
        {
            throw new InvalidPasswordException();
        }
    }

    @Override
    public void logout(String username) throws NoSuchUserException
    {    
        User user = databaseService.getUser(username);
        
        if(user.isLoggedIn())
        {
            user.setLoggedIn(false);
        }
    }

    @Override
    public boolean isLoggedIn(String username) throws NoSuchUserException
    {
        User user = databaseService.getUser(username);
        return user.isLoggedIn();
    }
}
