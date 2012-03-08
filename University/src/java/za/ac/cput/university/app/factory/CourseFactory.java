/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.university.app.factory;

import java.util.List;
import za.ac.cput.university.model.Course;
import za.ac.cput.university.model.Subject;

/**
 *
 * @author 210208880
 */
public class CourseFactory {
    
    public static Course getInstance(String name, List<Subject> subjects) {
        return new Course(name, subjects);
    }
}
