package za.ac.cput.assignment.plk;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.plk.obey.test.ObeyPLKJUnitTest;
import za.ac.cput.assignment.plk.violate.test.ViolatePLKJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ViolatePLKJUnitTest.class,
                     ObeyPLKJUnitTest.class})
public class PLKTestSuite
{
}