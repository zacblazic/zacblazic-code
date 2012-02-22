package za.ac.cput.polymorphism;

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
