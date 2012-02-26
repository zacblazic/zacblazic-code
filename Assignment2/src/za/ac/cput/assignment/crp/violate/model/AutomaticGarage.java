package za.ac.cput.assignment.crp.violate.model;

/**
 *
 * @author Zac Blazic
 */

public class AutomaticGarage extends Garage
{
    public AutomaticGarage(GarageDoor door)
    {
        super(door);
    }
    
    @Override
    public void openDoor()
    {
        System.out.println("Opening the door automatically...");
        door.setOpen(true);
    }
    
    @Override
    public void closeDoor()
    {
        System.out.println("Closing the door automatically...");
        door.setOpen(false);
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}
