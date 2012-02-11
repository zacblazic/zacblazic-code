package za.ac.cput.test.account;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.*;
import za.ac.cput.account.Account;
import za.ac.cput.account.conf.AccountModule;

/**
 *
 * @author Zac Blazic
 */

public class AccountJUnitTest {
    
    private static Injector injector;
    
    public AccountJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        injector = Guice.createInjector(new AccountModule());
    }

    @AfterClass
    public static void tearDownClass() throws Exception 
    {
    }
    
    @Before
    public void setUp() 
    {
    }
    
    @After
    public void tearDown() 
    {
    }
    
    @Test
    public void testDeposit() 
    {
        Account acc = injector.getInstance(Account.class);
        acc.deposit(500.0);
        Assert.assertEquals(500.0, acc.getBalance(), 0);
    }
    
    @Test
    public void testWithdraw() throws Exception
    {
        Account acc = injector.getInstance(Account.class);
        acc.withdraw(100.0);
        Assert.assertEquals(-100.0, acc.getBalance(), 0);
    }
}
