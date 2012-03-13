package za.ac.cput.university.test.repository;

import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import za.ac.cput.university.app.factory.UniversityFactory;
import za.ac.cput.university.model.Faculty;
import za.ac.cput.university.model.University;
import za.ac.cput.university.services.crud.UniversityCrudService;

/**
 *
 * @author Zac Blazic
 */

public class UniversityJUnitTest {
    private static ApplicationContext context;
    private static UniversityCrudService universityCrudService;
    private static Long universityId;
    
    public UniversityJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:za/ac/cput/university/app/conf/application-context.xml");
        universityCrudService = (UniversityCrudService)context.getBean("universityCrudService");
    }
    
    @Test
    public void testUniversity() {
        testCreateUniversity();
        testReadUniversity();
        testUpdateUniversity();
        testRemoveUniversity();
    }

    private void testRemoveUniversity() {
        University university = universityCrudService.findById(universityId);
        universityCrudService.remove(university);
        
        University removedUniversity = universityCrudService.findById(universityId);
        Assert.assertNull(removedUniversity);
    }

    private void testUpdateUniversity() {
        University university = universityCrudService.findById(universityId);
        university.setUniversityName("CPUT");
        universityCrudService.merge(university);
        
        University updatedUniversity = universityCrudService.findById(universityId);
        Assert.assertEquals("CPUT", updatedUniversity.getUniversityName());
    }

    private void testReadUniversity() {
        University university = universityCrudService.findById(universityId);
        Assert.assertNotNull(university);
    }

    private void testCreateUniversity() {
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("universityName", "Cape Peninsula University of Technology");
        properties.put("facultyName", "Informatics and Design");
        properties.put("facultyCode", "FID");
        properties.put("departmentName", "Information Technology");
        properties.put("departmentCode", "IT");
        
        University university = UniversityFactory.getInstance(properties);
        universityCrudService.persist(university);
        universityId = university.getId();
        Assert.assertNotNull(universityId);
    }

}