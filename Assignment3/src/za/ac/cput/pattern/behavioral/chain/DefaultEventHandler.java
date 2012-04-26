package za.ac.cput.pattern.behavioral.chain;

/**
 *
 * @author Zac Blazic
 */

public class DefaultEventHandler extends EventHandler {

    @Override
    public void handleRequest(Event request) {
        System.out.println("DefaultHandler handled unknown " + request);
    }
}