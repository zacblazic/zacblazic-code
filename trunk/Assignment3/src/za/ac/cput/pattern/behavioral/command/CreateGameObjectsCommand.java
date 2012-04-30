package za.ac.cput.pattern.behavioral.command;

/**
 *
 * @author Zac Blazic
 */

public class CreateGameObjectsCommand implements Command {

    private GameObjectManager gameObjectManager;
    
    public CreateGameObjectsCommand(GameObjectManager gameObjectManager) {
        this.gameObjectManager = gameObjectManager;
    }
    
    @Override
    public void execute() {
        gameObjectManager.createGameObjects();
    }
}