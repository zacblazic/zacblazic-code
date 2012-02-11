package za.ac.cput.login.conf;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import java.util.HashMap;
import java.util.Map;
import za.ac.cput.database.DatabaseService;
import za.ac.cput.database.internal.MockDatabaseService;
import za.ac.cput.database.model.User;
import za.ac.cput.login.LoginService;
import za.ac.cput.login.internal.WebLoginService;

/**
 *
 * @author Zac Blazic
 */

public class LoginServiceModule extends AbstractModule
{
    @Override
    public void configure()
    {
        bind(DatabaseService.class).to(MockDatabaseService.class);
        bind(LoginService.class).to(WebLoginService.class);
    }
    
    @Provides
    MockDatabaseService provideDatabaseService()
    {
        MockDatabaseService databaseService = new MockDatabaseService();
        databaseService.addUser("zacblazic@gmail.com", "password");
        return databaseService;
    }
}
