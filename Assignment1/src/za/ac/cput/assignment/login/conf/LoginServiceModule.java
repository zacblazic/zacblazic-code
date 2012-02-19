package za.ac.cput.assignment.login.conf;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import za.ac.cput.assignment.database.DatabaseService;
import za.ac.cput.assignment.database.internal.MockDatabaseService;
import za.ac.cput.assignment.login.LoginService;
import za.ac.cput.assignment.login.internal.StoreLoginService;

/**
 *
 * @author Zac Blazic
 */

public class LoginServiceModule extends AbstractModule
{
    @Override
    public void configure()
    {
        bind(LoginService.class).to(StoreLoginService.class);
        bind(DatabaseService.class).to(MockDatabaseService.class);
    }
    
    @Provides
    MockDatabaseService provideDatabaseService()
    {
        MockDatabaseService databaseService = new MockDatabaseService();
        databaseService.addUser("zacblazic@gmail.com", "password");
        return databaseService;
    }
}
