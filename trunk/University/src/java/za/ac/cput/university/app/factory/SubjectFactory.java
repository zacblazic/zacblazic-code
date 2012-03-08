/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.university.app.factory;

import za.ac.cput.university.model.Payment;
import za.ac.cput.university.model.Subject;

/**
 *
 * @author 210208880
 */
public class SubjectFactory {
    
    public static Subject getInstance() {
        return new Subject();
    }
    
    public static Subject getInstance(String name, Payment payment) {
        return new Subject(name, payment);
    }
}
