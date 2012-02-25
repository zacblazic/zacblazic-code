package za.ac.cput.assignment.srp.violate.test;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.assignment.srp.violate.model.Name;
import za.ac.cput.assignment.srp.violate.model.Student;

/**
 *
 * @author Zac Blazic
 */

public class ViolateSRPJUnitTest
{
    public ViolateSRPJUnitTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
    }

    @Test
    public void testPersist() 
    {
        /*
         * Here we have an employee that has 2 responsibilities
         * first of all it represents an entity from the domain
         * model and secondly it controls its persistence
         */
        
        /*
         * Please note there is intentionally no service used here.
         */
        
        Map<Long, Student> students = new HashMap<Long, Student>();
        Name name = new Name("Anthony", "Sabino", "Sanvido");
        Student student = new Student(4544, name, students);
        student.persist();
        
        Assert.assertNotNull(student.find());
    }
}