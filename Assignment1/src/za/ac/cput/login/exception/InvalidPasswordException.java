package za.ac.cput.login.exception;

/**
 *
 * @author Zac Blazic
 */

public class InvalidPasswordException extends Exception
{
    public InvalidPasswordException()
    {
        super("Invalid password");
    }
}
