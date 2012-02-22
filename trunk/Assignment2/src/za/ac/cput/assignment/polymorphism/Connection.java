package za.ac.cput.assignment.polymorphism;

/**
 *
 * @author Zac Blazic
 */

public interface Connection
{
    void open();
    void close();
    boolean isClosed();
    
}
