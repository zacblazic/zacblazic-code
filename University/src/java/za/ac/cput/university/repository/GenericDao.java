package za.ac.cput.university.repository;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Zac Blazic
 */

public interface GenericDao<T extends Serializable, ID> {
    void setClazz(final Class<T> clazz);
    public T findById(final ID id);
    public List<T> findAll();
    public void persist(final T entity);
    public void merge(final T entity);
    public void remove(final T entity);
    public void removeById(final ID id);
    public List<T> findInRange(int start, int end);
    public long count();
    public T getByPropertyName(String name, String value);
    public List<T> getEntitiesByProperName(String name, String value);
}
