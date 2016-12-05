package ua.lviv.logos.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.TechSupportDao;
import ua.lviv.logos.entity.TechSupport;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Repository
public class TechSupportDaoImpl implements TechSupportDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(TechSupport techSupport) {
        entityManager.persist(techSupport);
    }

    @Transactional
    public void edit(TechSupport techSupport) {
        entityManager.merge(techSupport);
    }

    @Transactional
    public void delete(TechSupport techSupport) {
        entityManager.remove(techSupport);
    }

    @Transactional
    public TechSupport findById(int id) {
        return entityManager.find(TechSupport.class, id);
    }

    @Transactional
    public List<TechSupport> findAll() {
        return entityManager.createQuery("from TechSupport ").getResultList();
    }

    @Transactional
    public List<TechSupport> findBySupportType(String support_type) {
        return entityManager.createNamedQuery("TechSupport.findBySupportType", TechSupport.class).setParameter("support_type", support_type).getResultList();
    }
}
