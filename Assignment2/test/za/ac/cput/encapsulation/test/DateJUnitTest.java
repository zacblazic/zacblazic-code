package za.ac.cput.encapsulation.test;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.encapsulation.Date;

/**
 *
 * @author Zac Blazic
 */

public class DateJUnitTest 
{    
    public DateJUnitTest() 
    {
    }
    
    @Test
    public void testIsLeapYear()
    {
        Date date = new Date(19, 2, 2012);
        
        Assert.assertTrue(date.isLeapYear());
    }
    
    @Test
    public void testToString()
    {
        Date date = new Date(20, 2, 2012);
        
        Assert.assertEquals("20 Feb 2012", date.toString());
    }
}
