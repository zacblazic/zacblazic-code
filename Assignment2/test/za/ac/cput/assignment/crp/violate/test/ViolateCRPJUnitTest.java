package za.ac.cput.assignment.crp.violate.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.crp.violate.conf.Config;
import za.ac.cput.assignment.crp.violate.model.AutomaticGarage;
import za.ac.cput.assignment.crp.violate.model.Garage;
import za.ac.cput.assignment.crp.violate.model.GarageDoor;
import za.ac.cput.assignment.crp.violate.service.GarageManager;

/**
 *
 * @author Zac Blazic
 */

public class ViolateCRPJUnitTest
{
    private static ApplicationContext context;
    
    public ViolateCRPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    public void testOpenManualGarage() 
    {
        GarageDoor door = new GarageDoor();
        Garage garage = new Garage(door);
        GarageManager garageManager = (GarageManager)context.getBean("garageManager");
        garageManager.openGarage(garage);
        
        Assert.assertTrue(garage.isOpen());
        
        garageManager.closeGarage(garage);
    }
    
    @Test
    public void testOpenAutomaticGarage() 
    {
        GarageDoor door = new GarageDoor();
        AutomaticGarage garage = new AutomaticGarage(door);
        GarageManager garageManager = (GarageManager)context.getBean("garageManager");
        garageManager.openGarage(garage);
        
        Assert.assertTrue(garage.isOpen());
        
        garageManager.closeGarage(garage);
    }
}