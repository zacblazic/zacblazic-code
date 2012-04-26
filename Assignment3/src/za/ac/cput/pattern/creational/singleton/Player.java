package za.ac.cput.pattern.creational.singleton;

/**
 *
 * @author Zac Blazic
 */

public class Player {
    private static Player player;
    private String name;
    
    private Player() {}
    
    public static Player getInstance() {
        if(player == null) {
            player = new Player();
        }
        
        return player;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}