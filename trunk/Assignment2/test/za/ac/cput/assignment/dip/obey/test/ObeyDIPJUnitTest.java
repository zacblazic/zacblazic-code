package za.ac.cput.assignment.dip.obey.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.dip.obey.conf.Config;
import za.ac.cput.assignment.dip.obey.model.EmployeeSalaryReport;
import za.ac.cput.assignment.dip.obey.service.EmployeeReporter;

/**
 *
 * @author Zac Blazic
 */

public class ObeyDIPJUnitTest
{
    private static ApplicationContext context;
    
    public ObeyDIPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    public void testGenerateSalaryReport() 
    {
        /*
         * To see the compliance please look at the Config
         */
        
        EmployeeReporter employeeReporter = (EmployeeReporter)context.getBean("employeeReporter");
        EmployeeSalaryReport report = employeeReporter.generateSalaryReport();
        
        Assert.assertNotNull(report);
        System.out.println(report);
    }
}