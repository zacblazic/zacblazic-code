package za.ac.cput.pattern.behavioral.state;

/**
 *
 * @author Zac Blazic
 */

public class Monster {

    private MonsterState monsterState;
    
    public Monster(MonsterState monsterState) {
        this.monsterState = monsterState;
    }
    
    public void setMonsterState(MonsterState monsterState) {
        this.monsterState = monsterState;
    }
    
    public void speak() {
        monsterState.speak();
    }
}