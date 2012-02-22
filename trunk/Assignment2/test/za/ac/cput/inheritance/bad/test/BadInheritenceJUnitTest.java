package za.ac.cput.inheritance.bad.test;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.inheritance.bad.SmartMobilePhone;

/**
 *
 * @author Zac Blazic
 */

public class BadInheritenceJUnitTest
{
    public BadInheritenceJUnitTest()
    {
    }

    @Test
    public void testCall() 
    {
        SmartMobilePhone phone = new SmartMobilePhone();
        phone.makeCall("0828943000");
        phone.endCall();
        phone.makeCall("0817434728");
        phone.endCall();
        
        Assert.assertEquals(2, phone.getCallCount());
    }
}