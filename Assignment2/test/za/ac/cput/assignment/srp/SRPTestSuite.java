package za.ac.cput.assignment.srp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.srp.obey.test.ObeySRPJUnitTest;
import za.ac.cput.assignment.srp.violate.test.ViolateSRPJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ViolateSRPJUnitTest.class,
                     ObeySRPJUnitTest.class})
public class SRPTestSuite
{
}