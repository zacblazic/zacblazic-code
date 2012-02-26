package za.ac.cput.assignment.crp.obey.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.crp.obey.conf.Config;
import za.ac.cput.assignment.crp.obey.model.Garage;
import za.ac.cput.assignment.crp.obey.model.garage.door.GarageDoor;
import za.ac.cput.assignment.crp.obey.model.garage.mechanism.AutomaticGarageDoorMechanism;
import za.ac.cput.assignment.crp.obey.model.garage.mechanism.GarageDoorMechanism;
import za.ac.cput.assignment.crp.obey.model.garage.mechanism.ManualGarageDoorMechanism;
import za.ac.cput.assignment.crp.obey.service.GarageManager;

/**
 *
 * @author Zac Blazic
 */

public class ObeyCRPJUnitTest
{
    private static ApplicationContext context;
    
    public ObeyCRPJUnitTest()
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
        GarageDoorMechanism mechanism = new ManualGarageDoorMechanism();
        Garage garage = new Garage(door, mechanism);
        GarageManager garageManager = (GarageManager)context.getBean("garageManager");
        garageManager.openGarage(garage);
        
        Assert.assertTrue(garage.isOpen());
        
        garageManager.closeGarage(garage);
    }
    
    @Test
    public void testOpenAutomaticGarage() 
    {
        GarageDoor door = new GarageDoor();
        GarageDoorMechanism mechanism = new AutomaticGarageDoorMechanism();
        Garage garage = new Garage(door, mechanism);
        GarageManager garageManager = (GarageManager)context.getBean("garageManager");
        garageManager.openGarage(garage);
        
        Assert.assertTrue(garage.isOpen());
        
        garageManager.closeGarage(garage);
    }
}
