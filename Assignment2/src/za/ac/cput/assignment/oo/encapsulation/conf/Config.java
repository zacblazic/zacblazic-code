package za.ac.cput.assignment.oo.encapsulation.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment.oo.encapsulation.service.internal.FastPrintService;

/**
 *
 * @author Zac Blazic
 */

@Configurable
public class Config
{
    @Bean(name="printService")
    public FastPrintService providePrintService()
    {
        return new FastPrintService();
    }
}
