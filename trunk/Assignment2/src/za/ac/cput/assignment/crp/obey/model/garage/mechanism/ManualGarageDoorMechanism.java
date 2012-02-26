package za.ac.cput.assignment.crp.obey.model.garage.mechanism;

import za.ac.cput.assignment.crp.obey.model.garage.door.GarageDoor;

/**
 *
 * @author Zac Blazic
 */

public class ManualGarageDoorMechanism implements GarageDoorMechanism
{
    @Override
    public void openDoor(GarageDoor door) 
    {
        System.out.println("Opening garage door manually...");
        door.setOpen(true);
    }

    @Override
    public void closeDoor(GarageDoor door) 
    {
        System.out.println("Closing garage door manually...");
        door.setOpen(false);
    }
}
