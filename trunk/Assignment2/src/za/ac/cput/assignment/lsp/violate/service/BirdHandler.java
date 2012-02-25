package za.ac.cput.assignment.lsp.violate.service;

import za.ac.cput.assignment.lsp.violate.model.Bird;

/**
 *
 * @author Zac Blazic
 */

public interface BirdHandler
{
    void launchBird(Bird bird);
    void recallBird(Bird bird);
}
