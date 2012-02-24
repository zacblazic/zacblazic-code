package za.ac.cput.assignment.oo.inheritance.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.oo.inheritance.service.internal.GlobalBillingService;

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
