/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Faculty implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String facultyName;
    private String facultyCode;
    
    @JoinColumn(name="faculty_id")
    @OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Department> departments = new ArrayList<Department>();
    
    public Faculty() {
    }
    
    public Faculty(String facultyName, String facultyCode) {
        this.facultyName = facultyName;
        this.facultyCode = facultyCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    
    public String getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public boolean addDepartment(Department department) {
        return departments.add(department);
    }

    public boolean removeDepartment(Department department) {
        return departments.remove(department);
    }
    
    public Department getDepartment(Long id) {
        for(Department department : departments) {
            if(department.getId().equals(id)) {
                return department;
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
        if (!(object instanceof Faculty)) {
            return false;
        }
        Faculty other = (Faculty) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.university.model.Faculty[ id=" + id + " ]";
    }
    
}
