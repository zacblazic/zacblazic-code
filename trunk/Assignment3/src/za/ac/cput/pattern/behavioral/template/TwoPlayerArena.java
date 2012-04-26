package za.ac.cput.pattern.behavioral.template;

/**
 *
 * @author Zac Blazic
 */

public class TwoPlayerArena extends Arena {

    @Override
    public void findPlayers() {
        System.out.println("Finding players...");
        System.out.println("1/2 players found...");
        System.out.println("2/2 players found...");
    }

    @Override
    public void preparePlayers() {
        System.out.println("Preparing players...");
        System.out.println("Players are prepared...");
    }
}