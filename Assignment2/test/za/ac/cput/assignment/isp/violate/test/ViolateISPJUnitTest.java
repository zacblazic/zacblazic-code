package za.ac.cput.assignment.isp.violate.test;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.isp.violate.conf.Config;
import za.ac.cput.assignment.isp.violate.model.AbductionReport;
import za.ac.cput.assignment.isp.violate.model.AutoTheftReport;
import za.ac.cput.assignment.isp.violate.model.SexualHarrassmentReport;
import za.ac.cput.assignment.isp.violate.service.report.CrimeReporter;

/**
 *
 * @author Zac Blazic
 */

public class ViolateISPJUnitTest
{
    private static ApplicationContext context;
    
    public ViolateISPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    public void testCompileAbductionReport() 
    {
        //Violent
        CrimeReporter crimeReporter = (CrimeReporter)context.getBean("crimeReporter");
        AbductionReport report = crimeReporter.compileAbductionReport();
        
        Assert.assertNotNull(report);
        System.out.println(report);
    }
    
    @Test
    public void testCompileAutoTheftReport()
    {
        //Theft
        CrimeReporter crimeReporter = (CrimeReporter)context.getBean("crimeReporter");
        AutoTheftReport report = crimeReporter.compileAutoTheftReport();
        
        Assert.assertNotNull(report);
        System.out.println(report);
    }
    
    @Test
    public void testCompileSexualHarrassementReport()
    {
        //Sexual
        CrimeReporter crimeReporter = (CrimeReporter)context.getBean("crimeReporter");
        SexualHarrassmentReport report = crimeReporter.compileSexualHarrassmentReport();
        
        Assert.assertNotNull(report);
        System.out.println(report);
    }
}