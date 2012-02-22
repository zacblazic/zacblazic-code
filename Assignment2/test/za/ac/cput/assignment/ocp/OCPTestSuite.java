package za.ac.cput.assignment.ocp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.ocp.bad.test.BadOCPJUnitTest;
import za.ac.cput.assignment.ocp.good.test.GoodOCPJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({BadOCPJUnitTest.class,
                     GoodOCPJUnitTest.class})
public class OCPTestSuite
{
}