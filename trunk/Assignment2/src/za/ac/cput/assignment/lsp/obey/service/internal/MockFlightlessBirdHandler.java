package za.ac.cput.assignment.lsp.obey.service.internal;

import za.ac.cput.assignment.lsp.obey.model.FlightlessBird;
import za.ac.cput.assignment.lsp.obey.service.FlightlessBirdHandler;

/**
 *
 * @author Zac Blazic
 */

public class MockFlightlessBirdHandler implements FlightlessBirdHandler
{
    @Override
    public void launchBird(FlightlessBird bird) 
    {
        bird.run();
    }

    @Override
    public void recallBird(FlightlessBird bird) 
    {
        bird.rest();
    }
}
