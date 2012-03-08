package za.ac.cput.university.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Zac Blazic
 */

@Entity
public class Course implements Serializable {    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    @JoinColumn(name="course_id")
    @OneToMany(cascade=CascadeType.ALL)
    private List<Subject> subjects;
    
    public Course() {
    }
    
    public Course(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setCourseName(String name) {
        this.name = name;
    }
    
    public String getCourseName() {
        return name;
    }
    
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    
    public List<Subject> getSubjects() {
        return subjects;
    }

    public boolean addSubject(Subject subject) {
        return subjects.add(subject);
    }
    
    public boolean removeSubject(Subject subject) {
        return subjects.remove(subject);
    }
    
    public Subject getSubject(Long id) {
        for(Subject s : subjects) {
            if(s.getId().equals(id)) {
                return s;  
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
        if (!(object instanceof Course)) {
            return false;
        }
        
        Course other = (Course) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.university.model.Course[ id=" + id + " ]";
    }
}
