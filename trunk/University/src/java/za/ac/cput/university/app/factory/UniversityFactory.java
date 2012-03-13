package za.ac.cput.university.app.factory;

import java.util.Map;
import za.ac.cput.university.model.Department;
import za.ac.cput.university.model.Faculty;
import za.ac.cput.university.model.University;

/**
 *
 * @author Zac Blazic
 */

public class UniversityFactory {
    
    public static University getInstance(Map<String, String> properties) {
        Department department = new Department(properties.get("departmentName"), properties.get("departmentCode"));
        
        Faculty faculty = new Faculty(properties.get("facultyName"), properties.get("facultyCode"));
        faculty.addDepartment(department);
        
        University university = new University(properties.get("universityName"));
        university.addFaculty(faculty);
        
        return university;
    }
}
