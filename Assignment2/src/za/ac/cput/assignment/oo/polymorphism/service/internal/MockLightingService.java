package za.ac.cput.assignment.oo.polymorphism.service.internal;

import za.ac.cput.assignment.oo.polymorphism.model.Bulb;
import za.ac.cput.assignment.oo.polymorphism.model.LightSocket;
import za.ac.cput.assignment.oo.polymorphism.service.LightingService;

/**
 *
 * @author Zac Blazic
 */

public class MockLightingService implements LightingService
{
    @Override
    public void changeBulb(LightSocket socket, Bulb bulb) 
    {
        if(bulb.getWattageRating() > socket.getWattageRating())
            throw new IllegalArgumentException("Bulb must have a wattage "
                    + "rating lower or equals to the socket wattage rating");
            
        socket.setBulb(bulb);
    }
}
