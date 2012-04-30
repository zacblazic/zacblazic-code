package za.ac.cput.pattern.behavioral.command;

import org.junit.Test;

/**
 *
 * @author Zac Blazic
 */

public class CommandPatternJUnitTest {
    
    public CommandPatternJUnitTest() {
    }

    @Test
    public void testCreateGameObjects() {
        GameObjectManager gameObjectManager = new GameObjectManager();
        Command createGameObjectsCommand = new CreateGameObjectsCommand(gameObjectManager);
        GameObjectInvoker gameObjectInvoker = new GameObjectInvoker(createGameObjectsCommand);
        gameObjectInvoker.invoke();
    }
}