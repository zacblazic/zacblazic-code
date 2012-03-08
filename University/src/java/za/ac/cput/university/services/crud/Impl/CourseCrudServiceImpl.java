package za.ac.cput.university.services.crud.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.university.model.Course;
import za.ac.cput.university.repository.GenericDao;
import za.ac.cput.university.services.crud.CourseCrudService;

/**
 *
 * @author Zac Blazic
 */

@Service("courseCrudService")
@Transactional
public class CourseCrudServiceImpl implements CourseCrudService {
    
    @Autowired
    private GenericDao<Course, Long> dao;
    
    public final void setDao(GenericDao<Course, Long> dao) {
        this.dao = dao;
        this.dao.setClazz(Course.class);
    }
    
    CourseCrudServiceImpl()
    {
    }

    @Override
    public Course findById(Long id) 
    {
        this.setDao(dao);
        return this.dao.findById(id);
    }

    @Override
    public void remove(Course entity) {
        dao.remove(entity);
    }

    @Override
    public void persist(Course entity) {
        dao.persist(entity);
    }

    @Override
    public void merge(Course entity) {
        dao.merge(entity);
    }

    @Override
    public List<Course> getEntitiesByProperName(String name, String value) {
        return dao.getEntitiesByProperName(name, value);
    }

    @Override
    public Course getByPropertyName(String name, String value) {
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Course> findInRange(int firstResult, int maxResults) {
        return dao.findInRange(firstResult, maxResults);
    }

    @Override
    public List<Course> findAll() {
        return dao.findAll();
    }

    @Override
    public void removeById(Long entityId) {
        dao.removeById(entityId);
    }

    @Override
    public long count() 
    {
        this.setDao(dao);
        return dao.count();
    }
}
