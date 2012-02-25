package za.ac.cput.assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.ocp.OCPTestSuite;
import za.ac.cput.assignment.oo.OOTestSuite;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({OOTestSuite.class,
                     OCPTestSuite.class})
public class Assignment2TestSuite
{
}