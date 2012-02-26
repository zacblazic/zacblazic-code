package za.ac.cput.assignment.crp.obey.model.garage.mechanism;

import za.ac.cput.assignment.crp.obey.model.garage.door.GarageDoor;

/**
 *
 * @author Zac Blazic
 */

public class AutomaticGarageDoorMechanism implements GarageDoorMechanism
{
    @Override
    public void openDoor(GarageDoor door) 
    {
        System.out.println("Opening garage door automatically...");
        door.setOpen(true);
    }

    @Override
    public void closeDoor(GarageDoor door) 
    {
        System.out.println("Closing garage door automatically...");
        door.setOpen(false);
    }
}
