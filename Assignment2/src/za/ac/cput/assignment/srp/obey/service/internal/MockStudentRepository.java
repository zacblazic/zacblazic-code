package za.ac.cput.assignment.srp.obey.service.internal;

import java.util.HashMap;
import java.util.Map;
import za.ac.cput.assignment.srp.obey.model.Student;
import za.ac.cput.assignment.srp.obey.service.StudentRepository;

/**
 *
 * @author Zac Blazic
 */

public class MockStudentRepository implements StudentRepository
{
    private final Map<Long, Student> students = new HashMap<Long, Student>();
    
    @Override
    public void persist(Student student) 
    {
        students.put(student.getId(), student);
    }

    @Override
    public Student findById(long id) 
    {
        return students.get(id);
    }
}
