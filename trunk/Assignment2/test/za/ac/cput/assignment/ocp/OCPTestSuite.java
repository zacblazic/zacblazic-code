package za.ac.cput.assignment.ocp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.ocp.obey.test.ObeyOCPJUnitTest;
import za.ac.cput.assignment.ocp.violate.test.ViolateOCPJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ViolateOCPJUnitTest.class,
                     ObeyOCPJUnitTest.class})
public class OCPTestSuite
{
}