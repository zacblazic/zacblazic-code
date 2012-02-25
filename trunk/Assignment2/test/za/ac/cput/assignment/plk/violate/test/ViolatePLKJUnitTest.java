package za.ac.cput.assignment.plk.violate.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.plk.violate.conf.Config;
import za.ac.cput.assignment.plk.violate.model.Car;
import za.ac.cput.assignment.plk.violate.model.Date;
import za.ac.cput.assignment.plk.violate.model.Location;
import za.ac.cput.assignment.plk.violate.model.SpeedingFine;
import za.ac.cput.assignment.plk.violate.service.TrafficService;

/**
 *
 * @author Zac Blazic
 */

public class ViolatePLKJUnitTest
{
    private static ApplicationContext context;
    
    public ViolatePLKJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    public void testIssueFines() 
    {
        Car car = new Car("CA505777", "Opel", "Utility");
        Date date = new Date(25, 2, 2012);
        Location location = new Location("Blouberg Road", "Table View", "Cape Town");
        TrafficService trafficService = (TrafficService)context.getBean("trafficService");
        SpeedingFine fine = trafficService.issueFine(car, date, location, 60, 87);
        
        /*
         * Below we are violating PLK by calling a method on a Car object who
         * is not our friend. This essentially couples the client with that
         * Car object, creating an unnecessary dependency.
         */
        
        System.out.println(fine);
        Assert.assertEquals("CA505777", fine.getCar().getRegistration());
        Assert.assertEquals("Cape Town", fine.getLocation().getTown());
    }
}