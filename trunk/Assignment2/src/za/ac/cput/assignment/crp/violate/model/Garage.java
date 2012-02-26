package za.ac.cput.assignment.crp.violate.model;

/**
 *
 * @author Zac Blazic
 */

public class Garage
{
    protected GarageDoor door;
    
    public Garage(GarageDoor door)
    {
        this.door = door;
    }

    public boolean isOpen()
    {
        return door.isOpen();
    }
    
    public void openDoor()
    {
        System.out.println("Opening the door manually...");
        door.setOpen(true);
    }
    
    public void closeDoor()
    {
        System.out.println("Closing the door manually...");
        door.setOpen(false);
    }

    @Override
    public String toString() 
    {
        return "Garage{" + "door=" + door + '}';
    }
}
