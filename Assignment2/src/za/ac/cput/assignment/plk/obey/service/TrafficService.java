package za.ac.cput.assignment.plk.obey.service;

import za.ac.cput.assignment.plk.obey.model.Car;
import za.ac.cput.assignment.plk.obey.model.Date;
import za.ac.cput.assignment.plk.obey.model.Location;
import za.ac.cput.assignment.plk.obey.model.SpeedingFine;

/**
 *
 * @author Zac Blazic
 */

public interface TrafficService
{
    SpeedingFine issueFine(Car car, Date date, Location location, int speedZone, int speed);
}
