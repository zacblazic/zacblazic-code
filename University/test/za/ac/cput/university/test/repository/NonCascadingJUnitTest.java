package za.ac.cput.university.test.repository;

import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import za.ac.cput.university.app.factory.CourseFactory;
import za.ac.cput.university.app.factory.StudentFactory;
import za.ac.cput.university.model.Course;
import za.ac.cput.university.model.Student;
import za.ac.cput.university.services.crud.CourseCrudService;
import za.ac.cput.university.services.crud.StudentCrudService;

/**
 *
 * @author Zac Blazic
 */

public class NonCascadingJUnitTest {
   
    private static ApplicationContext context;
    private static StudentCrudService studentCrudService;
    private static CourseCrudService courseCrudService;
    
    public NonCascadingJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:za/ac/cput/university/app/conf/application-context.xml");
        studentCrudService = (StudentCrudService)context.getBean("studentCrudService");
        courseCrudService = (CourseCrudService)context.getBean("courseCrudService");       
    }
    
    @Test
    public void testNoCascade() {
        Course course = CourseFactory.getInstance("Information Technology");
        courseCrudService.persist(course);
        
        Student student = StudentFactory.getInstance();
        student.setFirstName("Zac");
        student.setLastName("Blazic");
        student.setCourse(course);
        
        studentCrudService.persist(student);
        Assert.assertNotNull(student.getId());
    }
}