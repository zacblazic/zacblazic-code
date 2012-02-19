package za.ac.cput.assignment.login.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.assignment.database.exception.NoSuchUserException;
import za.ac.cput.assignment.login.LoginService;
import za.ac.cput.assignment.login.LoginService;
import za.ac.cput.assignment.login.conf.LoginServiceModule;
import za.ac.cput.assignment.login.exception.InvalidPasswordException;

/**
 *
 * @author Zac Blazic
 */

public class LoginServiceJUnitTest 
{
    private static Injector injector;
    
    public LoginServiceJUnitTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        injector = Guice.createInjector(new LoginServiceModule());
    }
    
    @Test
    public void testLogin() throws Exception
    {
        LoginService loginService = injector.getInstance(LoginService.class);
        loginService.login("zacblazic@gmail.com", "password");
        
        Assert.assertTrue(loginService.isLoggedIn("zacblazic@gmail.com"));
    }
    
    @Test(expected=NoSuchUserException.class)
    public void testLoginUsernameExeption() throws Exception
    {
        LoginService loginService = injector.getInstance(LoginService.class);
        loginService.login("invalid@gmail.com", "password");
    }
    
    @Test(expected=InvalidPasswordException.class)
    public void testLoginPasswordExeption() throws Exception
    {
        LoginService loginService = injector.getInstance(LoginService.class);
        loginService.login("zacblazic@gmail.com", "invalid");
    }
    
    @Test
    public void testLogout() throws Exception
    {
        LoginService loginService = injector.getInstance(LoginService.class);
        loginService.login("zacblazic@gmail.com", "password");
        loginService.logout("zacblazic@gmail.com");
        
        Assert.assertFalse(loginService.isLoggedIn("zacblazic@gmail.com"));
    }
}