package za.ac.cput.pattern;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.pattern.behavioral.BehavioralTestSuite;
import za.ac.cput.pattern.creational.CreationalTestSuite;
import za.ac.cput.pattern.structural.StructuralTestSuite;

/**
 *
 * @author Revar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({BehavioralTestSuite.class,
                     CreationalTestSuite.class,
                     StructuralTestSuite.class})
public class DesignPatternsTestSuite {
}