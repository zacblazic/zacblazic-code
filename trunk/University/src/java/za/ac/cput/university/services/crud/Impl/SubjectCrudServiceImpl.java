package za.ac.cput.university.services.crud.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.university.model.Subject;
import za.ac.cput.university.repository.GenericDao;
import za.ac.cput.university.services.crud.SubjectCrudService;

/**
 *
 * @author Zac Blazic
 */

@Service("subjectCrudService")
@Transactional
public class SubjectCrudServiceImpl implements SubjectCrudService {
    private GenericDao<Subject, Long> dao;
    
    public SubjectCrudServiceImpl() {
    }
    
    @Autowired
    public final void setDao(GenericDao<Subject, Long> dao)
    {
        this.dao = dao;
        this.dao.setClazz(Subject.class);
    }

    @Override
    public Subject findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<Subject> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Subject entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Subject entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Subject entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        dao.removeById(entityId);
    }

    @Override
    public List<Subject> findInRange(int start, int end) {
        setDao(dao);
        return dao.findInRange(start, end);
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public Subject getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Subject> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
