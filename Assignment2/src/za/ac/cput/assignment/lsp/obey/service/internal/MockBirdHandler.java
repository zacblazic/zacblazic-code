package za.ac.cput.assignment.lsp.obey.service.internal;

import za.ac.cput.assignment.lsp.obey.model.Bird;
import za.ac.cput.assignment.lsp.obey.service.BirdHandler;

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
