package za.ac.cput.assignment.lsp.obey.service;

import za.ac.cput.assignment.lsp.obey.model.Bird;

/**
 *
 * @author Zac Blazic
 */

public interface BirdHandler
{
    void launchBird(Bird bird);
    void recallBird(Bird bird);
}
