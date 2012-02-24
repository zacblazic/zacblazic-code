package za.ac.cput.assignment.oo.inheritance.test;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.oo.inheritance.conf.Config;
import za.ac.cput.assignment.oo.inheritance.model.CreditCard;
import za.ac.cput.assignment.oo.inheritance.model.Date;
import za.ac.cput.assignment.oo.inheritance.model.Invoice;
import za.ac.cput.assignment.oo.inheritance.service.BillingService;

/**
 *
 * @author Zac Blazic
 */

public class InheritanceJUnitTest
{
    private static ApplicationContext context;
    
    public InheritanceJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    public void testBill() 
    {
        BillingService billingService = (BillingService)context.getBean("billingService");
        CreditCard creditCard = new CreditCard("2058937034038303", new Date(1, 9, 2013), "634");
        BigDecimal amount = new BigDecimal(1000);
        
        Invoice invoice = billingService.bill(creditCard, amount);
        Assert.assertNotNull(invoice);
    }
}