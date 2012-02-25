package za.ac.cput.assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.ocp.OCPTestSuite;
import za.ac.cput.assignment.oo.OOTestSuite;
import za.ac.cput.assignment.plk.PLKTestSuite;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({OOTestSuite.class,
                     OCPTestSuite.class,
                     PLKTestSuite.class})
public class Assignment2TestSuite
{
}