package za.ac.cput.assignment.oo.polymorphism.service;

import za.ac.cput.assignment.oo.polymorphism.model.Bulb;
import za.ac.cput.assignment.oo.polymorphism.model.LightSocket;

/**
 *
 * @author Zac Blazic
 */

public interface LightingService
{
    void changeBulb(LightSocket socket, Bulb bulb);
}
