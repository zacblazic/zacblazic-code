package za.ac.cput.database;

import za.ac.cput.database.exception.NoSuchUserException;
import za.ac.cput.database.model.User;

/**
 *
 * @author Zac Blazic
 */

public interface DatabaseService 
{
    void addUser(String username, String password);
    User getUser(String username) throws NoSuchUserException;
}
