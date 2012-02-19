package za.ac.cput.assignment.database.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.assignment.database.DatabaseService;
import za.ac.cput.assignment.database.DatabaseService;
import za.ac.cput.assignment.database.conf.DatabaseServiceModule;
import za.ac.cput.assignment.database.model.User;

/**
 *
 * @author Zac Blazic
 */

public class DatabaseServiceJUnitTest 
{
    private static Injector injector;
    
    public DatabaseServiceJUnitTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        injector = Guice.createInjector(new DatabaseServiceModule());
    }

    @Test
    public void testGetUser() throws Exception
    {
        DatabaseService databaseService = injector.getInstance(DatabaseService.class);
        User user = databaseService.getUser("zacblazic@gmail.com");
        
        Assert.assertEquals("zacblazic@gmail.com", user.getUsername());
        Assert.assertEquals("password", user.getPassword());
        Assert.assertFalse(user.isLoggedIn());
    }
}