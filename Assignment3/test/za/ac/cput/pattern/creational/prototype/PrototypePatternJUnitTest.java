/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.prototype;

import org.junit.*;

/**
 *
 * @author 210208880
 */
public class PrototypePatternJUnitTest {
    
    public PrototypePatternJUnitTest() {
    }

    @Test
    public void testCloneInstance() {
        Player player1 = new Player("Revar");
        Player player2 = (Player)player1.cloneInstance();
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2 + " (cloned)");
        
        Monster monster1 = new Monster("Zombie");
        Monster monster2 = (Monster)monster1.cloneInstance();
        System.out.println("Monster 1: " + monster1);
        System.out.println("Monster 2: " + monster2 + " (cloned)");
    }
}