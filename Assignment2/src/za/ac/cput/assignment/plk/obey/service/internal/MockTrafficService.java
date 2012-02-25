package za.ac.cput.assignment.plk.obey.service.internal;

import za.ac.cput.assignment.plk.obey.model.Car;
import za.ac.cput.assignment.plk.obey.model.Date;
import za.ac.cput.assignment.plk.obey.model.Location;
import za.ac.cput.assignment.plk.obey.model.SpeedingFine;
import za.ac.cput.assignment.plk.obey.service.TrafficService;

/**
 *
 * @author Zac Blazic
 */

public class MockTrafficService implements TrafficService
{
    @Override
    public SpeedingFine issueFine(Car car, Date date, Location location, int speedZone, int speed) 
    {
        if(speed <= speedZone)
            throw new IllegalArgumentException("Speed does not exceed the speed zone");
        
        double amountDue = (speed - speedZone) * 20.0;
        SpeedingFine fine = new SpeedingFine(car, date, location, speedZone, speed, amountDue);
        
        return fine;
    }
}
