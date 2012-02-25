package za.ac.cput.assignment.plk.violate.model;

/**
 *
 * @author Zac Blazic
 */

public final class Car
{
    private final String registration;
    private final String make;
    private final String model;
    
    public Car(String registration, String make, String model)
    {
        this.registration = registration;
        this.make = make;
        this.model = model;
    }
    
    public String getRegistration()
    {
        return registration;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    @Override
    public String toString()
    {
        return registration + " - " + make + " " + model;
    }
}
