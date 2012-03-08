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
    @Autowired
    private GenericDao<Subject, Long> dao;
    
    private void setDao(GenericDao<Subject, Long> dao)
    {
        this.dao = dao;
        this.dao.setClazz(Subject.class);
    }

    @Override
    public Subject findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Subject> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void persist(Subject entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void merge(Subject entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Subject entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeById(Long entityId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Subject> findInRange(int firstResult, int maxResults) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Subject getByPropertyName(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Subject> getEntitiesByProperName(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
