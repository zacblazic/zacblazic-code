package za.ac.cput.pattern.behavioral.chain;

/**
 *
 * @author Zac Blazic
 */

public class KeyboardEventHandler extends EventHandler {

    @Override
    public void handleRequest(Event request) {
        if(request == Event.KEYBOARD_EVENT) {
            System.out.println("KeyboardEventHandler handled " + request);
        } else if(successor != null) {
            System.out.println("KeyboardEventHandler does not handle " + request);
            successor.handleRequest(request);
        }
    }  
}