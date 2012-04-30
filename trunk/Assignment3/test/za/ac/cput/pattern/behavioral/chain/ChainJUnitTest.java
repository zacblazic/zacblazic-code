package za.ac.cput.pattern.behavioral.chain;

import org.junit.Test;

/**
 *
 * @author Zac Blazic
 */

public class ChainJUnitTest {
    
    public ChainJUnitTest() {
    }

    @Test
    public void testHandleRequest() {
        EventHandler chain = initializeChain();
        chain.handleRequest(Event.MOUSE_EVENT);
        chain.handleRequest(Event.KEYBOARD_EVENT);
        chain.handleRequest(Event.DEFAULT_EVENT);
    }
    
    private EventHandler initializeChain() {
        EventHandler keyboardEventHandler = new KeyboardEventHandler();
        EventHandler mouseEventHandler = new MouseEventHandler();
        EventHandler defaultEventHandler = new DefaultEventHandler();
        
        keyboardEventHandler.setSuccessor(mouseEventHandler);
        mouseEventHandler.setSuccessor(defaultEventHandler);
        
        return keyboardEventHandler;
    }
}