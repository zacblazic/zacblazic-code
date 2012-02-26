package za.ac.cput.assignment.crp.obey.model.garage.mechanism;

import za.ac.cput.assignment.crp.obey.model.garage.door.GarageDoor;

/**
 *
 * @author Zac Blazic
 */

public interface GarageDoorMechanism
{
    void openDoor(GarageDoor door);
    void closeDoor(GarageDoor door);
}
