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

@Transactional
@Service("courseCrudService")
public class CourseCrudServiceImpl implements CourseCrudService {
    private GenericDao<Course, Long> dao;
    
    @Autowired
    public final void setDao(GenericDao<Course, Long> dao) {
        this.dao = dao;
        this.dao.setClazz(Course.class);
    }
    
    CourseCrudServiceImpl() {
    }

    @Override
    public Course findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public void remove(Course entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void persist(Course entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Course entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public List<Course> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }

    @Override
    public Course getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Course> findInRange(int start, int end) {
        setDao(dao);
        return dao.findInRange(start, end);
    }

    @Override
    public List<Course> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        dao.removeById(entityId);
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
}
