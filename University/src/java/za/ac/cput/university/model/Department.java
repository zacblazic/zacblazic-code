package za.ac.cput.university.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author 210208880
 */

@Entity
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String departmentName;
    private String departmentCode;
    
    @JoinColumn(name="department_id")
    @OneToMany
    private List<Course> courses = new ArrayList<Course>();

    public Department() {
    }
    
    public Department(String departmentName, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
    
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public void removeCourse(Course course) {
        courses.remove(course);
    }
    
    public Course getCourse(Long id) {
        for(Course course : courses) {
            if(course.getId().equals(id)) {
                return course;
            }
        }
        
        return null;
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
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.university.model.Department[ id=" + id + " ]";
    }
    
}
