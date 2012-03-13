package za.ac.cput.university.services.crud.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.university.model.University;
import za.ac.cput.university.repository.GenericDao;
import za.ac.cput.university.services.crud.UniversityCrudService;

/**
 *
 * @author Zac Blazic
 */

@Transactional
@Service("universityCrudService")
public class UniversityCrudServiceImpl implements UniversityCrudService {
    private GenericDao<University, Long> dao;
    
    @Autowired
    private void setDao(GenericDao<University, Long> dao) {
        this.dao = dao;
        this.dao.setClazz(University.class);
    }
    
    @Override
    public University findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<University> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(University entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(University entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(University entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long id) {
        setDao(dao);
        dao.removeById(id);
    }

    @Override
    public List<University> findInRange(int start, int end) {
        setDao(dao);
        return dao.findInRange(start, end);
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public University getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<University> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
