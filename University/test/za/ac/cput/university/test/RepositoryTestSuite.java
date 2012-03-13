package za.ac.cput.university.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.university.test.repository.*;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({StudentJUnitTest.class,
                     PaymentJUnitTest.class,
                     SubjectJUnitTest.class,
                     CourseJUnitTest.class,
                     UniversityJUnitTest.class})
public class RepositoryTestSuite
{
}