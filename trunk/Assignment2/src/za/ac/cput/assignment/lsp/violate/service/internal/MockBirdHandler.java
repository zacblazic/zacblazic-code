package za.ac.cput.assignment.lsp.violate.service.internal;

import za.ac.cput.assignment.lsp.violate.model.Bird;
import za.ac.cput.assignment.lsp.violate.service.BirdHandler;

/**
 *
 * @author Zac Blazic
 */

public class MockBirdHandler implements BirdHandler
{
    @Override
    public void launchBird(Bird bird) 
    {
        bird.fly();
    }
    
    @Override
    public void recallBird(Bird bird)
    {
        bird.land();
    }
}
