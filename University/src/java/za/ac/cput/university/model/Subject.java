package za.ac.cput.university.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Zac Blazic
 */

@Entity
public class Subject implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    @OneToOne(cascade=CascadeType.ALL, orphanRemoval=true)
    private Payment payment;
    
    public Subject() {    
    }
    
    public Subject(String name, Payment payment) {
        this.name = name;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getSubjectName() {
        return name;
    }
    
    public void setSubjectName(String name) {
        this.name = name;
    }
    
    public Payment getPayment() {
        return payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.university.model.Subject[ id=" + id + " ]";
    }
}
