/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.university.app.factory;

import za.ac.cput.university.model.Course;

/**
 *
 * @author 210208880
 */
public class CourseFactory {
    
    public static Course getInstance(String name) {
        Course course = new Course(name);
        
        return course;
    }
}
