package za.ac.cput.assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.encapsulation.test.EncapsulationJUnitTest;
import za.ac.cput.assignment.lsp.LSPTestSuite;
import za.ac.cput.assignment.ocp.OCPTestSuite;
import za.ac.cput.assignment.polymorphism.test.PolymorphismJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({EncapsulationJUnitTest.class,
                     PolymorphismJUnitTest.class,
                     OCPTestSuite.class,
                     LSPTestSuite.class})
public class Assignment2TestSuite
{
}