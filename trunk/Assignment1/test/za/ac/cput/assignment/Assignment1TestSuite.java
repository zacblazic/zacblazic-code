package za.ac.cput.assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.account.test.AccountJUnitTest;
import za.ac.cput.assignment.clock.test.ClockJUnitTest;
import za.ac.cput.assignment.database.test.DatabaseServiceJUnitTest;
import za.ac.cput.assignment.login.test.LoginServiceJUnitTest;
import za.ac.cput.assignment.prime.test.PrimeJUnitTest;
import za.ac.cput.assignment.resolver.test.ResolverJUnitTest;
import za.ac.cput.assignment.searcher.test.SearcherJUnitTest;
import za.ac.cput.assignment.shoppingcart.test.ShoppingCartJUnitTest;
import za.ac.cput.assignment.sorter.test.SorterJUnitTest;
import za.ac.cput.assignment.urlshortener.test.URLShortenerJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({AccountJUnitTest.class,
                     ClockJUnitTest.class,
                     DatabaseServiceJUnitTest.class, 
                     LoginServiceJUnitTest.class, 
                     PrimeJUnitTest.class, 
                     ResolverJUnitTest.class, 
                     SorterJUnitTest.class,
                     ShoppingCartJUnitTest.class, 
                     SearcherJUnitTest.class,
                     URLShortenerJUnitTest.class})
public class Assignment1TestSuite 
{
}