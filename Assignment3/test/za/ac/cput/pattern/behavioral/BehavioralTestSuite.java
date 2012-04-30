package za.ac.cput.pattern.behavioral;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.pattern.behavioral.chain.ChainJUnitTest;
import za.ac.cput.pattern.behavioral.command.CommandPatternJUnitTest;
import za.ac.cput.pattern.behavioral.iterator.IteratorJUnitTest;
import za.ac.cput.pattern.behavioral.mediator.MediatorPatternJUnitTest;
import za.ac.cput.pattern.behavioral.memento.MementoJUnitTest;
import za.ac.cput.pattern.behavioral.observer.ObserverPatternJUnitTest;
import za.ac.cput.pattern.behavioral.state.StatePatternJUnitTest;
import za.ac.cput.pattern.behavioral.strategy.StrategyPatternJUnitTest;
import za.ac.cput.pattern.behavioral.template.TemplatePatternJUnitTest;
import za.ac.cput.pattern.behavioral.visitor.VisitorPatternJUnitTest;

/**
 *
 * @author Revar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ChainJUnitTest.class,
                     CommandPatternJUnitTest.class,
                     IteratorJUnitTest.class,
                     MediatorPatternJUnitTest.class,
                     MementoJUnitTest.class,
                     ObserverPatternJUnitTest.class,
                     StatePatternJUnitTest.class,
                     StrategyPatternJUnitTest.class,
                     TemplatePatternJUnitTest.class,
                     VisitorPatternJUnitTest.class})
public class BehavioralTestSuite {
}