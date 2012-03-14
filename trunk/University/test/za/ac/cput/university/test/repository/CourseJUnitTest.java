package za.ac.cput.university.test.repository;

import java.math.BigDecimal;
import java.util.Date;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import za.ac.cput.university.app.factory.CourseFactory;
import za.ac.cput.university.app.factory.PaymentFactory;
import za.ac.cput.university.app.factory.SubjectFactory;
import za.ac.cput.university.model.Course;
import za.ac.cput.university.model.Payment;
import za.ac.cput.university.model.Subject;
import za.ac.cput.university.services.crud.CourseCrudService;

/**
 *
 * @author Zac Blazic
 */

public class CourseJUnitTest {
    private static ApplicationContext context;
    private static CourseCrudService courseCrudService;
    private static Long courseId;
    
    public CourseJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:za/ac/cput/university/app/conf/application-context.xml");
        courseCrudService = (CourseCrudService)context.getBean("courseCrudService");
    }
    
    @Test
    public void testCourse() {
        testCreateCourse();
        testReadCourse();
        testUpdateCourse();
        testDeleteCourse();
    }

    private void testCreateCourse() {
        Payment payment = PaymentFactory.getInstance();
        payment.setAmount(new BigDecimal(1000));
        payment.setDatePaid(new Date());
        payment.setOpeningBalance(new BigDecimal(3500));
        
        Subject subject = SubjectFactory.getInstance();
        subject.setPayment(payment);
        
        Course course = CourseFactory.getInstance("Computer Science");
        course.addSubject(subject);
        
        courseCrudService.persist(course);
        courseId = course.getId();
        
        Assert.assertNotNull(courseId);
    }
    
    private void testReadCourse() {
        Course course = courseCrudService.findById(courseId);
        Assert.assertNotNull(course);
    }
    
    private void testUpdateCourse() {
        Subject subject = SubjectFactory.getInstance();
        Course course = courseCrudService.findById(courseId);
        course.addSubject(subject);
        courseCrudService.merge(course);
        
        Course updatedCourse = courseCrudService.findById(courseId);
        
        Assert.assertEquals(2, updatedCourse.getSubjects().size());
    }
    
    private void testDeleteCourse() {
        Course course = courseCrudService.findById(courseId);
        courseCrudService.remove(course);
        Course removedCourse = courseCrudService.findById(courseId);
        Assert.assertNull(removedCourse);
    }  
}