package za.ac.cput.lsp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.lsp.bad.test.BadLSPJUnitTest;
import za.ac.cput.lsp.good.test.GoodLSPJUnitTest;

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