package za.ac.cput.assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.lsp.LSPTestSuite;
import za.ac.cput.assignment.ocp.OCPTestSuite;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({OCPTestSuite.class,
                     LSPTestSuite.class})
public class Assignment2TestSuite
{
}