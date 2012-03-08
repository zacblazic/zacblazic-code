/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.university.test.repository;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import za.ac.cput.university.app.factory.StudentFactory;
import za.ac.cput.university.model.Student;
import za.ac.cput.university.services.crud.StudentCrudService;

/**
 *
 * @author 210208880
 */
public class StudentJUnitTest 
{
    private static ApplicationContext context;
    private static StudentCrudService studentCrudService;
    private static Long studentId;
    
    public StudentJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new ClassPathXmlApplicationContext("classpath:za/ac/cput/university/app/conf/application-context.xml");
        studentCrudService = (StudentCrudService)context.getBean("studentCrudService");
    }

    @Test
    public void testStudent() {
        testCreateStudent();
        testReadStudent();
        testUpdateStudent();
        testDeleteStudent();
    }
    
    private void testCreateStudent() {
        Student student = StudentFactory.getInstance();
        student.setFirstName("Zachari");
        student.setLastName("Blazic");
        studentCrudService.persist(student);
        studentId = student.getId();
        Assert.assertNotNull(studentId);
    }
    
    private void testReadStudent() {
        Student student = studentCrudService.findById(studentId);
        Assert.assertNotNull(student);
    }

    private void testUpdateStudent() {
        Student student = studentCrudService.findById(studentId);
        student.setFirstName("Zachari");
        studentCrudService.merge(student);
        Student updatedStudent = studentCrudService.findById(studentId);
        Assert.assertEquals("Zachari", updatedStudent.getFirstName());
    }

    private void testDeleteStudent() {
        //Delete
        Student student = studentCrudService.findById(studentId);
        studentCrudService.remove(student);
        Student removedStudent = studentCrudService.findById(studentId);
        Assert.assertNull(removedStudent);
    }
}
