package za.ac.cput.assignment.database.exception;

/**
 *
 * @author Zac Blazic
 */

public class NoSuchUserException extends Exception
{
    public NoSuchUserException()
    {
        super("No such user exists");
    }
}
