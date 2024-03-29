package za.ac.cput.assignment.database.conf;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import za.ac.cput.assignment.database.DatabaseService;
import za.ac.cput.assignment.database.internal.MockDatabaseService;

/**
 *
 * @author Zac Blazic
 */

public class DatabaseServiceModule extends AbstractModule
{
    @Override
    protected void configure() 
    {
        bind(DatabaseService.class).to(MockDatabaseService.class);
    }
    
    @Provides
    public MockDatabaseService provideDatabaseService()
    {
        MockDatabaseService databaseService = new MockDatabaseService();
        databaseService.addUser("zacblazic@gmail.com", "password");
        return databaseService;
    }
}
