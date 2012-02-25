package za.ac.cput.assignment.dip;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.dip.obey.test.ObeyDIPJUnitTest;
import za.ac.cput.assignment.dip.violate.test.ViolateDIPJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ViolateDIPJUnitTest.class,
                     ObeyDIPJUnitTest.class})
public class DIPTestSuite
{
}