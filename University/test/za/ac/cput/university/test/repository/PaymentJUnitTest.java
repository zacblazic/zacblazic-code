/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.university.test.repository;

import java.math.BigDecimal;
import java.util.Date;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import za.ac.cput.university.app.factory.PaymentFactory;
import za.ac.cput.university.model.Payment;
import za.ac.cput.university.services.crud.PaymentCrudService;

/**
 *
 * @author Thozamile
 */
public class PaymentJUnitTest {
    private static ApplicationContext ctx;
    private static PaymentCrudService paymentCrudService;
    private static Long paymentId;
    
    public PaymentJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
       ctx = new ClassPathXmlApplicationContext("classpath:za/ac/cput/university/app/conf/applicationContext-*.xml");
       paymentCrudService = (PaymentCrudService) ctx.getBean("paymentCrudService");
    }
    
    @Test
    public void testPayment()
    {
        testCreatePayment();
        testReadPayment();
        testUpdatePayment();
        testDeletePayment();
    }
    
    private void testCreatePayment() {
        Payment payment = PaymentFactory.getInstance();
        payment.setOpeningBalance(new BigDecimal(5000));
        payment.setAmount(new BigDecimal(1000));
        payment.setDatePaid(new Date());
        paymentCrudService.persist(payment);
        paymentId = payment.getId();
        Assert.assertNotNull(paymentId);
    }
    
    private void testReadPayment() {
        Payment payment = paymentCrudService.findById(paymentId);
        Assert.assertNotNull(payment);
    }
    
    private void testUpdatePayment() {
        Payment payment = paymentCrudService.findById(paymentId);
        payment.setAmount(new BigDecimal(500));
        payment.setOpeningBalance(new BigDecimal(100));
        paymentCrudService.merge(payment);
        Payment updatedPayment = paymentCrudService.findById(paymentId);
        Assert.assertEquals(new BigDecimal(500), updatedPayment.getAmount());
        Assert.assertEquals(new BigDecimal(100), updatedPayment.getOpeningBalance());
    }

    private void testDeletePayment() {
        Payment payment = paymentCrudService.findById(paymentId);
        paymentCrudService.remove(payment);
        Payment removedPayment = paymentCrudService.findById(paymentId);
        Assert.assertNull(removedPayment);
    }
}
