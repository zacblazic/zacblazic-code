package za.ac.cput.assignment.crp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.crp.obey.test.ObeyCRPJUnitTest;
import za.ac.cput.assignment.crp.violate.test.ViolateCRPJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ViolateCRPJUnitTest.class,
                     ObeyCRPJUnitTest.class})
public class CRPTestSuite
{
}