package za.ac.cput.university.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.university.test.repository.CourseJUnitTest;
import za.ac.cput.university.test.repository.PaymentJUnitTest;
import za.ac.cput.university.test.repository.StudentJUnitTest;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({StudentJUnitTest.class,
                     PaymentJUnitTest.class,
                     CourseJUnitTest.class})
public class RepositoryTestSuite
{
}