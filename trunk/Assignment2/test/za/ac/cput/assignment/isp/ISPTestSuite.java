package za.ac.cput.assignment.isp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.isp.obey.test.ObeyISPJUnitTest;
import za.ac.cput.assignment.isp.violate.test.ViolateISPJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ViolateISPJUnitTest.class,
                     ObeyISPJUnitTest.class})
public class ISPTestSuite
{
}