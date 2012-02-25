package za.ac.cput.assignment.plk.violate.service;

import za.ac.cput.assignment.plk.violate.model.Car;
import za.ac.cput.assignment.plk.violate.model.Date;
import za.ac.cput.assignment.plk.violate.model.Location;
import za.ac.cput.assignment.plk.violate.model.SpeedingFine;

/**
 *
 * @author Zac Blazic
 */

public interface TrafficService
{
    SpeedingFine issueFine(Car car, Date date, Location location, int speedZone, int speed);
}
