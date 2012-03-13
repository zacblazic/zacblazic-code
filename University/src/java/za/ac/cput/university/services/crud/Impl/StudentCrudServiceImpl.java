/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.university.services.crud.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.university.model.Student;
import za.ac.cput.university.repository.GenericDao;
import za.ac.cput.university.services.crud.StudentCrudService;

/**
 *
 * @author 210208880
 */

@Transactional
@Service("studentCrudService")
public class StudentCrudServiceImpl implements StudentCrudService {
    private GenericDao<Student, Long> dao;

    @Autowired
    public final void setDao(GenericDao<Student, Long> dao) {
        this.dao = dao;
        this.dao.setClazz(Student.class);
    }
    
    public StudentCrudServiceImpl() {
    }
    
    @Override
    public Student findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<Student> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Student entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Student entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Student entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        dao.removeById(entityId);
    }

    @Override
    public List<Student> findInRange(int start, int end) {
        setDao(dao);
        return dao.findInRange(start, end);
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public Student getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Student> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }  
}
