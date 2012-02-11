package za.ac.cput.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.test.account.AccountJUnitTest;
import za.ac.cput.test.clock.ClockJUnitTest;
import za.ac.cput.test.database.DatabaseServiceJUnitTest;
import za.ac.cput.test.login.LoginServiceJUnitTest;
import za.ac.cput.test.prime.PrimeJUnitTest;
import za.ac.cput.test.resolver.ResolverJUnitTest;
import za.ac.cput.test.shoppingcart.ShoppingCartJUnitTest;
import za.ac.cput.test.sorter.SorterJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({AccountJUnitTest.class, ClockJUnitTest.class,
        DatabaseServiceJUnitTest.class, LoginServiceJUnitTest.class, 
        PrimeJUnitTest.class, ResolverJUnitTest.class, SorterJUnitTest.class,
        ShoppingCartJUnitTest.class})
public class Assignment1TestSuite 
{
}