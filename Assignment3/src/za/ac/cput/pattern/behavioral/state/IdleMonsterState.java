package za.ac.cput.pattern.behavioral.state;

/**
 *
 * @author Zac Blazic
 */

public class IdleMonsterState implements MonsterState {

    @Override
    public void speak() {
        System.out.println("I smell you. Show yourself!");
    }
}