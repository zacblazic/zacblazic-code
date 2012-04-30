package za.ac.cput.pattern.behavioral.state;

/**
 *
 * @author Zac Blazic
 */

public class AttackMonsterState implements MonsterState {

    @Override
    public void speak() {
        System.out.println("You will die!");
    }
}