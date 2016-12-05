package ua.lviv.logos.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.FinancingDao;
import ua.lviv.logos.entity.Financing;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Repository
public class FinancingDaoImpl implements FinancingDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(Financing financing) {
        entityManager.persist(financing);
    }

    @Transactional
    public void edit(Financing financing) {
        entityManager.merge(financing);
    }

    @Transactional
    public void delete(Financing financing) {
        entityManager.remove(financing);
    }

    @Transactional
    public Financing findById(int id) {
        return entityManager.find(Financing.class, id);
    }

    @Transactional
    public List<Financing> findAll() {
        return entityManager.createQuery("from Financing ").getResultList();
    }

    @Transactional
    public List<Financing> findByType(String type) {
        return entityManager.createNamedQuery("Financing.findByType", Financing.class).setParameter("type", type).getResultList();
    }
}
