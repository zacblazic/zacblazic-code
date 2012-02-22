package za.ac.cput.lsp.good;

/**
 *
 * @author Zac Blazic
 */

public class FlightlessBird
{
    private boolean running;
    
    public void run()
    {
        System.out.println("Zooooom...");
        this.setRunning(true);
    }
    
    public void setRunning(boolean running)
    {
        this.running = running;
    }
    
    public boolean isRunning()
    {
        return running;
    }
}
