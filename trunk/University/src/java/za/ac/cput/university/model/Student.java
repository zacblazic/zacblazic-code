/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.university.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author 210208880
 */
@Entity
public class Student implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Embedded
    private Name name;
    
    @ManyToOne
    private Course course;
    
    public Student()
    {
    }
    
    public Student(Name name)
    {
        this.name = name;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMiddleName(String middleName) {
        name.setMiddleName(middleName);
    }

    public void setLastName(String lastName) {
        name.setLastName(lastName);
    }

    public void setFirstName(String firstName) {
        name.setFirstName(firstName);
    }

    public String getMiddleName() {
        return name.getMiddleName();
    }

    public String getLastName() {
        return name.getLastName();
    }

    public String getFirstName() {
        return name.getFirstName();
    }
    
    public Course getCourse() {
        return course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.university.model.Student[ id=" + id + " ]";
    }
}
