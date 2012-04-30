package za.ac.cput.pattern.structural.adapter;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Revar
 */

public class AdapterJUnitTest {

    private static TemperatureInfo temperatureInfo;
    
    public AdapterJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        temperatureInfo = new TemperatureInfoReporter(new CelciusReporter());
    }
    
    @Test
    public void testAdapter() {
        temperatureInfo.setTemperatureCelcius(0);
        System.out.println("Temperture in celcius: " + temperatureInfo.getTemperatureCelcius());
        System.out.println("Temperture in farenheit: " + temperatureInfo.getTemperatureFarenheit());
        
        temperatureInfo.setTemperatureFarenheit(85);
        System.out.println("Temperture in celcius: " + temperatureInfo.getTemperatureCelcius());
        System.out.println("Temperture in farenheit: " + temperatureInfo.getTemperatureFarenheit());
    }
}