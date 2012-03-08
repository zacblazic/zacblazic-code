package za.ac.cput.university.repository.jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import org.springframework.stereotype.Repository;
import za.ac.cput.university.repository.GenericDao;

/**
 *
 * @author boniface
 */

@Repository("dao")
public class GenericDaoHibernateImpl<T extends Serializable>  implements GenericDao<T, Long> {
    private Class<T> clazz;
    
    @PersistenceContext(type=PersistenceContextType.EXTENDED)
    EntityManager entityManager;

    @Override
    public void setClazz(final Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T findById(final Long id) {
        return this.entityManager.find(this.clazz, id);
    }

    @Override
    public List<T> findAll() {
        return this.entityManager.createQuery("FROM " + this.clazz.getName()).getResultList();
    }

    @Override
    public void persist(final T entity) { 
        this.entityManager.persist(entity);
    }

    @Override
    public void merge(final T entity) {
        this.entityManager.merge(entity);
    }

    @Override
    public void remove(final T entity) {
        this.entityManager.remove(entity);
    }

    @Override
    public void removeById(final Long entityId) {
        final T entity = this.findById(entityId);
        this.remove(entity);
    }

    @Override
    public List<T> findInRange(int firstResult, int maxResults) {
        return entityManager.createQuery("SELECT a FROM " + this.clazz.getName() + " e").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }

    @Override
    public long count() {
        return (Long) entityManager.createQuery("SELECT count(e) FROM " + this.clazz.getName() + " e").getSingleResult();
    }

    @Override
    public T getByPropertyName(String name, String value) {
        List<T> list = entityManager.createQuery("SELECT e FROM " + this.clazz.getName() + " e WHERE e." + name + "=?1").setParameter(1, value).getResultList();
        return (list.isEmpty()) ? null : list.get(0);
    }

    @Override
    public List<T> getEntitiesByProperName(String name, String value) {
        List<T> list = entityManager.createQuery("SELECT e FROM  " + this.clazz.getName() + " e WHERE e." + name + "=?1").setParameter(1, value).getResultList();
        return list;
    }
}