package za.ac.cput.assignment.crp.obey.service;

import za.ac.cput.assignment.crp.obey.model.Garage;

/**
 *
 * @author Zac Blazic
 */

public interface GarageManager
{
    void openGarage(Garage garage);
    void closeGarage(Garage garage);
}
