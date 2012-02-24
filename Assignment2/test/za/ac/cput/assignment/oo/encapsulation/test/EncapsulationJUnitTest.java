package za.ac.cput.assignment.oo.encapsulation.test;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.oo.encapsulation.conf.Config;
import za.ac.cput.assignment.oo.encapsulation.model.Document;
import za.ac.cput.assignment.oo.encapsulation.service.PrintService;

/**
 *
 * @author Zac Blazic
 */

public class EncapsulationJUnitTest
{
    private static ApplicationContext context;
    
    public EncapsulationJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    public void testPrint() 
    {
        PrintService printService = (PrintService)context.getBean("printService");
        Document document = new Document("Effective Java", "pdf", 50);
        Assert.assertTrue(printService.print(document));
    }
}