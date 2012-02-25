package za.ac.cput.assignment.plk.obey.model;

/**
 *
 * @author Zac Blazic
 */

public final class SpeedingFine
{
    private final Car car;
    private final Date date;
    private final Location location;
    private final int speedZone;
    private final int speed;
    private final double amountDue;
    
    public SpeedingFine(Car car, Date date, Location location, int speedZone, int speed, double amountDue)
    {
        this.car = car;
        this.date = date;
        this.location = location;
        this.speedZone = speedZone;
        this.speed = speed;
        this.amountDue = amountDue;
    }

    public String getCarRegistration() 
    {
        return car.getRegistration();
    }
    
    public String getCarMake()
    {
        return car.getMake();
    }
    
    public String getCarModel()
    {
        return car.getModel();
    }

    public int getIssueDay()
    {
        return date.getDay();
    }
    
    public int getIssueMonth()
    {
        return date.getMonth();
    }
    
    public int getIssueYear()
    {
        return date.getYear();
    }
    
    public String getLocationRoad()
    {
        return location.getRoad();
    }
    
    public String getLocationArea()
    {
        return location.getArea();
    }
    
    public String getLocationTown()
    {
        return location.getTown();
    }

    public int getSpeed() 
    {
        return speed;
    }

    public int getSpeedZone() 
    {
        return speedZone;
    }
    
    public double getAmountDue()
    {
        return amountDue;
    }

    @Override
    public String toString() 
    {
        return "SpeedingFine{" + "car=" + car + ", date=" + date + ", location=" + location + ", speedZone=" + speedZone + ", speed=" + speed + ", amountDue=" + amountDue + '}';
    }
}
