package za.ac.cput.university.test.repository;

import java.math.BigDecimal;
import java.util.Date;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import za.ac.cput.university.app.factory.PaymentFactory;
import za.ac.cput.university.app.factory.SubjectFactory;
import za.ac.cput.university.model.Payment;
import za.ac.cput.university.model.Subject;
import za.ac.cput.university.services.crud.SubjectCrudService;

/**
 *
 * @author Zac Blazic
 */

public class SubjectJUnitTest {
    private static ApplicationContext context;
    private static SubjectCrudService subjectCrudService;
    private static Long subjectId;
    
    public SubjectJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:za/ac/cput/university/app/conf/application-context.xml");
        subjectCrudService = (SubjectCrudService)context.getBean("subjectCrudService");
    }

    @Test
    public void testSubject() {
        testCreateSubject();
    }

    private void testCreateSubject() {
        Payment payment = PaymentFactory.getInstance();
        payment.setAmount(new BigDecimal(1500));
        payment.setOpeningBalance(new BigDecimal(3000));
        payment.setDatePaid(new Date());
        
        Subject subject = SubjectFactory.getInstance("Technical Programming", payment);
        subjectCrudService.persist(subject);
        subjectId = subject.getId();
        Assert.assertNotNull(subjectId);
    }
}