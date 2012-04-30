package za.ac.cput.pattern.behavioral.state;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Revar
 */

public class StatePatternJUnitTest {

    private static Monster monster;
    
    public StatePatternJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        MonsterState idle = new IdleMonsterState();
        monster = new Monster(idle);
    }

    @Test 
    public void testSpeak() {
        monster.speak();
        MonsterState attack = new AttackMonsterState();
        monster.setMonsterState(attack);
        monster.speak();
    }
}