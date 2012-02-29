package za.ac.cput.assignment.adp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.adp.obey.test.ObeyADPJUnitTest;
import za.ac.cput.assignment.adp.violate.test.ViolateADPJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ViolateADPJUnitTest.class,
                     ObeyADPJUnitTest.class})
public class ADPTestSuite
{
}