package za.ac.cput.assignment.dip.violate.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.dip.violate.conf.Config;
import za.ac.cput.assignment.dip.violate.model.EmployeeSalaryReport;
import za.ac.cput.assignment.dip.violate.service.EmployeeReporter;

/**
 *
 * @author Zac Blazic
 */

public class ViolateDIPJUnitTest
{
    private static ApplicationContext context;
    
    public ViolateDIPJUnitTest()
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
        EmployeeReporter employeeReporter = (EmployeeReporter)context.getBean("employeeReporter");
        EmployeeSalaryReport report = employeeReporter.generateSalaryReport();
        
        Assert.assertNotNull(report);
        System.out.println(report);
    }
}