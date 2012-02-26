package za.ac.cput.assignment.crp.violate.service.internal;

import za.ac.cput.assignment.crp.violate.model.Garage;
import za.ac.cput.assignment.crp.violate.service.GarageManager;

/**
 *
 * @author Zac Blazic
 */

public class MockGarageManager implements GarageManager
{
    @Override
    public void openGarage(Garage garage) 
    {
        garage.openDoor();
    }

    @Override
    public void closeGarage(Garage garage) 
    {
        garage.closeDoor();
    }
}
