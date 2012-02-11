package za.ac.cput.database.conf;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import java.util.HashMap;
import java.util.Map;
import za.ac.cput.database.DatabaseService;
import za.ac.cput.database.internal.MockDatabaseService;
import za.ac.cput.database.model.User;

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
    MockDatabaseService provideDatabaseService()
    {
        Map<String, User> users = new HashMap<>();
        users.put("zacblazic@gmail.com", new User("zacblazic@gmail.com", "password"));
        
        MockDatabaseService databaseService = new MockDatabaseService(users);
        return databaseService;
    }
}
