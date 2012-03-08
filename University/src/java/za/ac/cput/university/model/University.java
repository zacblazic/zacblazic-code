/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.university.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author 210208880
 */
@Entity
public class University implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @JoinColumn(name="university_id")
    @OneToMany
    private List<Faculty> faculties;
    
    public University()
    {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof University)) {
            return false;
        }
        University other = (University) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.university.model.University[ id=" + id + " ]";
    }
    
}
