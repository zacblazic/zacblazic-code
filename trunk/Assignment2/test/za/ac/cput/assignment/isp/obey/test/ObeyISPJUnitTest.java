package za.ac.cput.assignment.isp.obey.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.isp.obey.conf.Config;
import za.ac.cput.assignment.isp.obey.model.AbductionReport;
import za.ac.cput.assignment.isp.obey.model.AutoTheftReport;
import za.ac.cput.assignment.isp.obey.model.SexualHarrassmentReport;
import za.ac.cput.assignment.isp.obey.service.report.SexualCrimeReporter;
import za.ac.cput.assignment.isp.obey.service.report.TheftCrimeReporter;
import za.ac.cput.assignment.isp.obey.service.report.ViolentCrimeReporter;

/**
 *
 * @author Zac Blazic
 */

public class ObeyISPJUnitTest
{
    private static ApplicationContext context;
    
    public ObeyISPJUnitTest()
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
        ViolentCrimeReporter violentCrimeReporter = (ViolentCrimeReporter)context.getBean("violentCrimeReporter");
        AbductionReport report = violentCrimeReporter.compileAbductionReport();
        
        Assert.assertNotNull(report);
        System.out.println(report);
    }
    
    @Test
    public void testCompileAutoTheftReport()
    {
        //Theft
        TheftCrimeReporter theftCrimeReporter = (TheftCrimeReporter)context.getBean("theftCrimeReporter");
        AutoTheftReport report = theftCrimeReporter.compileAutoTheftReport();
        
        Assert.assertNotNull(report);
        System.out.println(report);
    }
    
    @Test
    public void testCompileSexualHarrassementReport()
    {
        //Sexual
        SexualCrimeReporter sexualCrimeReporter = (SexualCrimeReporter)context.getBean("sexualCrimeReporter");
        SexualHarrassmentReport report = sexualCrimeReporter.compileSexualHarrassmentReport();
        
        Assert.assertNotNull(report);
        System.out.println(report);
    }
}