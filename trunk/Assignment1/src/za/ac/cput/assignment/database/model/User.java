package za.ac.cput.assignment.database.model;

/**
 *
 * @author Zac Blazic
 */

public class User
{
    private final String username;
    private final String password;
    private boolean loggedIn;
    
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.loggedIn = false;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public boolean isLoggedIn()
    {
        return loggedIn;
    }
    
    public void setLoggedIn(boolean loggedIn)
    {
        this.loggedIn = loggedIn;
    }
}
