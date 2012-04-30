package za.ac.cput.pattern.creational;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.pattern.creational.abstractfactory.AbstractFactoryJUnitTest;
import za.ac.cput.pattern.creational.builder.BuilderJUnitTest;
import za.ac.cput.pattern.creational.factory.FactoryPatternJUnitTest;
import za.ac.cput.pattern.creational.prototype.PrototypePatternJUnitTest;
import za.ac.cput.pattern.creational.singleton.PlayerJUnitTest;

/**
 *
 * @author Revar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AbstractFactoryJUnitTest.class,
                     BuilderJUnitTest.class,
                     FactoryPatternJUnitTest.class,
                     PrototypePatternJUnitTest.class,
                     PlayerJUnitTest.class})
public class CreationalTestSuite {
}