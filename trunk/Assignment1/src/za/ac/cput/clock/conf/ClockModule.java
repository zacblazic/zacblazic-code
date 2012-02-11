package za.ac.cput.clock.conf;

import com.google.inject.AbstractModule;
import za.ac.cput.clock.Clock;
import za.ac.cput.clock.internal.DigitalClock;

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
