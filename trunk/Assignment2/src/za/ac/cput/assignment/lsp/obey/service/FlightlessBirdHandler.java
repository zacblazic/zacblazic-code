package za.ac.cput.assignment.lsp.obey.service;

import za.ac.cput.assignment.lsp.obey.model.FlightlessBird;

/**
 *
 * @author Zac Blazic
 */

public interface FlightlessBirdHandler
{
    void launchBird(FlightlessBird bird);
    void recallBird(FlightlessBird bird);
}
