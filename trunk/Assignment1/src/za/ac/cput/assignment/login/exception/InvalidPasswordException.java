package za.ac.cput.assignment.login.exception;

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
