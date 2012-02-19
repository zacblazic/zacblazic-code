package za.ac.cput.assignment.sorter.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.assignment.sorter.Sorter;
import za.ac.cput.assignment.sorter.Sorter;
import za.ac.cput.assignment.sorter.conf.SorterModule;

/**
 *
 * @author Zac Blazic
 */

public class SorterJUnitTest 
{
    private static Injector injector;
    
    public SorterJUnitTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        injector = Guice.createInjector(new SorterModule());
    }
    
    @Test
    public void testSortAscending() 
    {
        Sorter sorter = injector.getInstance(Sorter.class);
        sorter.insertArray(new int[]{5, 39, 0, -1, 100, 5});
        
        Assert.assertArrayEquals(new int[]{-1, 0, 5, 5, 39, 100}, sorter.sortAscending());
    }
    
    @Test
    public void testSortDescending() 
    {
        Sorter sorter = injector.getInstance(Sorter.class);
        sorter.insertArray(new int[]{5, 39, 0, -1, 100, 5});
        
        Assert.assertArrayEquals(new int[]{-1, 0, 5, 5, 39, 100}, sorter.sortAscending());
    }
}
