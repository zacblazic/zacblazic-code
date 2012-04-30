package za.ac.cput.pattern.structural;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.pattern.structural.adapter.AdapterJUnitTest;
import za.ac.cput.pattern.structural.bridge.BridgeJUnitTest;
import za.ac.cput.pattern.structural.composite.CompositeJUnitTest;
import za.ac.cput.pattern.structural.decorator.DecoratorJUnitTest;
import za.ac.cput.pattern.structural.facade.FacadeJUnitTest;
import za.ac.cput.pattern.structural.flyweight.FlyweightJUnitTest;
import za.ac.cput.pattern.structural.proxy.ProxyJUnitTest;

/**
 *
 * @author Revar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AdapterJUnitTest.class,
                     BridgeJUnitTest.class,
                     CompositeJUnitTest.class,
                     DecoratorJUnitTest.class,
                     FacadeJUnitTest.class,
                     FlyweightJUnitTest.class,
                     ProxyJUnitTest.class})
public class StructuralTestSuite {
}