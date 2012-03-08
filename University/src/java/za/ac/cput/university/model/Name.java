package za.ac.cput.university.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author 210208880
 */

@Embeddable
public class Name implements Serializable {
    private String firstName;
    private String middleName;
    private String lastName;
    
    public Name() {
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "Name{" + "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + '}';
    }
}
