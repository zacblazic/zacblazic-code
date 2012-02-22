package za.ac.cput;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.encapsulation.test.EncapsulationJUnitTest;
import za.ac.cput.lsp.LSPTestSuite;
import za.ac.cput.polymorphism.test.PolymorphismJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({EncapsulationJUnitTest.class,
                     PolymorphismJUnitTest.class,
                     LSPTestSuite.class})
public class Assignment2TestSuite
{
}