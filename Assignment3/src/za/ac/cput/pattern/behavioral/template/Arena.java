package za.ac.cput.pattern.behavioral.template;

/**
 *
 * @author Zac Blazic
 */

public abstract class Arena {
    
    public final void initializeMatch() {
        findPlayers();
        preparePlayers();
    }
    
    public abstract void findPlayers();
    public abstract void preparePlayers();
}