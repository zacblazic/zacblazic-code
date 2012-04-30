/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.abstractfactory;

/**
 *
 * @author 210208880
 */
public class PlayerFactory implements EntityFactory {

    @Override
    public Entity getEntity() {
        return new Player();
    }
}
