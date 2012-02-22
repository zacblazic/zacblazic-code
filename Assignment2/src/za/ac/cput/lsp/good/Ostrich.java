package za.ac.cput.lsp.good;

/**
 *
 * @author Zac Blazic
 */

public class Ostrich extends FlightlessBird
{
    @Override
    public void run()
    {
        System.out.println("The ostrich struts away at 70km/h!");
        super.setRunning(true);
    }
}
