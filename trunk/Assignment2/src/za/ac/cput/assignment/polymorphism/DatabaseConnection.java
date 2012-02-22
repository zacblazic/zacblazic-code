package za.ac.cput.assignment.polymorphism;

/**
 *
 * @author Zac Blazic
 */

public abstract class DatabaseConnection implements Connection
{
    private boolean closed;
    
    @Override
    public void open() 
    {
        closed = false;
    }
    
    @Override
    public void close() 
    {
        closed = true;
    }
    
    @Override
    public boolean isClosed()
    {
        return closed;
    }
}
