/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.abstractfactory;

/**
 *
 * @author 210208880
 */
public class AbstractEntityFactory {
    
    public EntityFactory getEntityFactory(String entityFactoryType) {
        if(entityFactoryType.equalsIgnoreCase("playerFactory")) {
            return new PlayerFactory();
        } else {
            return new MonsterFactory();
        }
    }
}
