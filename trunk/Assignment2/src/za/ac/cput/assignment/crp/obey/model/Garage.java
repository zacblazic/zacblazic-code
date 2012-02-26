package za.ac.cput.assignment.crp.obey.model;

import za.ac.cput.assignment.crp.obey.model.garage.door.GarageDoor;
import za.ac.cput.assignment.crp.obey.model.garage.mechanism.GarageDoorMechanism;

/**
 *
 * @author Zac Blazic
 */

public class Garage
{
    private GarageDoor door;
    private GarageDoorMechanism mechanism;
    
    public Garage(GarageDoor door, GarageDoorMechanism mechansim)
    {
        this.door = door;
        this.mechanism = mechansim;
    }

    public boolean isOpen()
    {
        return door.isOpen();
    }
    
    public void openDoor()
    {
        mechanism.openDoor(door);
    }
    
    public void closeDoor()
    {
        mechanism.closeDoor(door);
    }

    @Override
    public String toString() 
    {
        return "Garage{" + "door=" + door + '}';
    }
}
