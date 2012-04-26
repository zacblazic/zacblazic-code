package za.ac.cput.pattern.behavioral.chain;

/**
 *
 * @author Zac Blazic
 */

public class MouseEventHandler extends EventHandler {

    @Override
    public void handleRequest(Event request) {
        if(request == Event.MOUSE_EVENT) {
            System.out.println("MouseEventHandler handled " + request);
        } else if(successor != null) {
            System.out.println("MouseEventHandler does not handle " + request);
            successor.handleRequest(request);
        }
    }
}