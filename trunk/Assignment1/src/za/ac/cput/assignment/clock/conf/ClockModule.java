package za.ac.cput.assignment.clock.conf;

import com.google.inject.AbstractModule;
import za.ac.cput.assignment.clock.Clock;
import za.ac.cput.assignment.clock.internal.DigitalClock;

/**
 *
 * @author Zac Blazic
 */

public class ClockModule extends AbstractModule
{
    @Override
    protected void configure() 
    {
        bind(Clock.class).to(DigitalClock.class);
    }
}
