/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.university.app.factory;

import za.ac.cput.university.model.Name;
import za.ac.cput.university.model.Student;

/**
 *
 * @author 210208880
 */
public class StudentFactory {
    
    public static Student getInstance() {
        Name name = new Name();
        Student student = new Student(name);
        
        return student;
    }
    
    public static Student getInstance(Name name) {
        return new Student(name);
    }
}
