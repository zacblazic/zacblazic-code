/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.abstractfactory;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author 210208880
 */
public class AbstractFactoryJUnitTest {
    
    private static AbstractEntityFactory abstractEntityFactory;
    
    public AbstractFactoryJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        abstractEntityFactory = new AbstractEntityFactory();
    }
    
    @Test
    public void testEntityFactories() {
        EntityFactory playerFactory = abstractEntityFactory.getEntityFactory("playerFactory");
        EntityFactory monsterFactory = abstractEntityFactory.getEntityFactory("monsterFactory");
        
        Entity player = playerFactory.getEntity();
        Entity monster = monsterFactory.getEntity();
        
        player.setLocation(new Location(5, 3));
        monster.setLocation(new Location(5, 1));
        
        System.out.println("Player location");
        System.out.println("X: " + player.getLocation().getX());
        System.out.println("Y: " + player.getLocation().getY());
        System.out.println();
        
        System.out.println("Monster location");
        System.out.println("X: " + monster.getLocation().getX());
        System.out.println("Y: " + monster.getLocation().getY());
    }
}
