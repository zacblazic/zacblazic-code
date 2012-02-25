package za.ac.cput.assignment.oo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.oo.composition.test.CompositionJUnitTest;
import za.ac.cput.assignment.oo.encapsulation.test.EncapsulationJUnitTest;
import za.ac.cput.assignment.oo.inheritance.test.InheritanceJUnitTest;
import za.ac.cput.assignment.oo.polymorphism.test.PolymorphismJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({EncapsulationJUnitTest.class,
                     InheritanceJUnitTest.class,
                     PolymorphismJUnitTest.class,
                     CompositionJUnitTest.class})
public class OOTestSuite
{
}