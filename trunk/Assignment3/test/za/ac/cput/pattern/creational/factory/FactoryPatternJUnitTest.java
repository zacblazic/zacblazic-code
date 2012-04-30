/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.factory;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author 210208880
 */
public class FactoryPatternJUnitTest {
    
    public static MonsterFactory monsterFactory;
    
    public FactoryPatternJUnitTest() {  
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        monsterFactory = MonsterFactory.getInstance();
    }

    @Test
    public void testGetInstance() {
        Monster zombie = monsterFactory.createMonster("zombie");
        System.out.println("Zombie: " + zombie.taunt());
        
        Monster skeleton = monsterFactory.createMonster("skeleton");
        System.out.println("Skeleton: " + skeleton.taunt());
    }
}