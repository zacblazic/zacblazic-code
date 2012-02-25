package za.ac.cput.assignment.srp.obey.service;

import za.ac.cput.assignment.srp.obey.model.Student;

/**
 *
 * @author Zac Blazic
 */

public interface StudentRepository
{
    void persist(Student student);
    Student findById(long id);
}
