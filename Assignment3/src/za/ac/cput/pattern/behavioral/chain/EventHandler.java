package za.ac.cput.pattern.behavioral.chain;

/**
 *
 * @author Zac Blazic
 */

public abstract class EventHandler {
 
    protected EventHandler successor;
    
    public void setSuccessor(EventHandler successor) {
        this.successor = successor;
    }
    
    public abstract void handleRequest(Event request);
}