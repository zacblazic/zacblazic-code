package za.ac.cput.assignment.srp.obey.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.assignment.srp.obey.conf.Config;
import za.ac.cput.assignment.srp.obey.model.Name;
import za.ac.cput.assignment.srp.obey.model.Student;
import za.ac.cput.assignment.srp.obey.service.StudentRepository;

/**
 *
 * @author Zac Blazic
 */

public class ObeySRPJUnitTest
{
    private static ApplicationContext context;
    
    public ObeySRPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    public void testPersist() 
    {
        Name name = new Name("Johnothan", "Hallgreen-Pauli");
        Student student = new Student(34534, name);
        StudentRepository studentRepository = (StudentRepository)context.getBean("studentRepository");
        studentRepository.persist(student);
        
        Assert.assertNotNull(studentRepository.findById(34534));
    }
}