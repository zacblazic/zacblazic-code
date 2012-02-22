package za.ac.cput.assignment.lsp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.lsp.bad.test.BadLSPJUnitTest;
import za.ac.cput.assignment.lsp.good.test.GoodLSPJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({BadLSPJUnitTest.class,
                     GoodLSPJUnitTest.class})
public class LSPTestSuite
{
}