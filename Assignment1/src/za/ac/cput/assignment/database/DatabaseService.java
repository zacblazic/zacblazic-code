package za.ac.cput.assignment.database;

import za.ac.cput.assignment.database.exception.NoSuchUserException;
import za.ac.cput.assignment.database.model.User;

/**
 *
 * @author Zac Blazic
 */

public interface DatabaseService 
{
    void addUser(String username, String password);
    User getUser(String username) throws NoSuchUserException;
}
