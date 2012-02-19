package za.ac.cput.assignment.login;

import za.ac.cput.assignment.database.exception.NoSuchUserException;
import za.ac.cput.assignment.login.exception.InvalidPasswordException;

/**
 *
 * @author Zac Blazic
 */

public interface LoginService 
{
    void login(String username, String password) throws NoSuchUserException, InvalidPasswordException;
    void logout(String username) throws NoSuchUserException;
    boolean isLoggedIn(String username) throws NoSuchUserException;
}
