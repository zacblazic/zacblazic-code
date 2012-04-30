/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.factory;

/**
 *
 * @author 210208880
 */
public class MonsterFactory {
    private static MonsterFactory instance;
    
    private MonsterFactory() {}
    
    public Monster createMonster(String monsterType) {
        if(monsterType.equalsIgnoreCase("zombie")) {
            return new Zombie();
        } else {
            return new Skeleton();
        }
    }
    
    public static MonsterFactory getInstance() {
        if(instance == null) {
            instance = new MonsterFactory();
        }
        
        return instance;
    }
}