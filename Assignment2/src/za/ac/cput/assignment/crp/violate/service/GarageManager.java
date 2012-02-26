package za.ac.cput.assignment.crp.violate.service;

import za.ac.cput.assignment.crp.violate.model.Garage;

/**
 *
 * @author Zac Blazic
 */

public interface GarageManager
{
    void openGarage(Garage garage);
    void closeGarage(Garage garage);
}
