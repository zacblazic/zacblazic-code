package za.ac.cput.assignment.plk.obey.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.plk.obey.conf.Config;
import za.ac.cput.assignment.plk.obey.model.Car;
import za.ac.cput.assignment.plk.obey.model.Date;
import za.ac.cput.assignment.plk.obey.model.Location;
import za.ac.cput.assignment.plk.obey.model.SpeedingFine;
import za.ac.cput.assignment.plk.obey.service.TrafficService;

/**
 *
 * @author Zac Blazic
 */

public class ObeyPLKJUnitTest
{
    private static ApplicationContext context;
    
    public ObeyPLKJUnitTest()
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
        Car car = new Car("CA273864", "BMW", "X5");
        Date date = new Date(25, 2, 2012);
        Location location = new Location("Marine Drive", "Milnerton", "Cape Town");
        TrafficService trafficService = (TrafficService)context.getBean("trafficService");
        SpeedingFine fine = trafficService.issueFine(car, date, location, 60, 140);
        
        /*
         * We are now obeying PLK by only calling a method on our friend object,
         * SpeedingFine.
         */
        
        System.out.println(fine);
        Assert.assertEquals("CA273864", fine.getCarRegistration());
        Assert.assertEquals("Cape Town", fine.getLocationTown());
    }
}