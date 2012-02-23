package za.ac.cput.assignment.ocp.good.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.ocp.good.internal.BasicCheckoutBiller;
import za.ac.cput.assignment.ocp.good.internal.MockCheckoutBiller;
import za.ac.cput.assignment.ocp.good.internal.SuperCheckoutBiller;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class BillerConfig
{
    @Bean(name="basicCheckoutBiller")
    public BasicCheckoutBiller provideBasicBiller()
    {
        return new BasicCheckoutBiller();
    }
    
    @Bean(name="superCheckoutBiller")
    public SuperCheckoutBiller provideSuperBiller()
    {
        return new SuperCheckoutBiller();
    }
    
    @Bean(name="mockCheckoutBiller")
    public MockCheckoutBiller provideMockBiller()
    {
        return new MockCheckoutBiller();
    }
}
