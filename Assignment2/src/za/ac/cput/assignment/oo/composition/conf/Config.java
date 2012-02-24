package za.ac.cput.assignment.oo.composition.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.oo.composition.service.internal.GlobalBillingService;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean(name="billingService")
    public GlobalBillingService provideBillingService()
    {
        return new GlobalBillingService();
    }
}
