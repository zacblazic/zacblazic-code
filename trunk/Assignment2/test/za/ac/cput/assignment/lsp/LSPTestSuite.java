package za.ac.cput.assignment.lsp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.lsp.obey.ObeyLSPJUnitTest;
import za.ac.cput.assignment.lsp.violate.test.ViolateLSPJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ViolateLSPJUnitTest.class,
                     ObeyLSPJUnitTest.class})
public class LSPTestSuite
{
}