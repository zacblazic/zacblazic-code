package za.ac.cput.pattern.behavioral.command;

/**
 *
 * @author Zac Blazic
 */

public class GameObjectInvoker {
    
    private Command command;
    
    public GameObjectInvoker(Command command) {
        this.command = command;
    }
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void invoke() {
        command.execute();
    }
}