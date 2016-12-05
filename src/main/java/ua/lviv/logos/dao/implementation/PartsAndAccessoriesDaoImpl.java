package ua.lviv.logos.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.PartsAndAccessoriesDao;
import ua.lviv.logos.entity.PartsAndAccessories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Repository
public class PartsAndAccessoriesDaoImpl implements PartsAndAccessoriesDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(PartsAndAccessories partsAndAccessories) {
        entityManager.persist(partsAndAccessories);
    }

    @Transactional
    public void edit(PartsAndAccessories partsAndAccessories) {
        entityManager.merge(partsAndAccessories);
    }

    @Transactional
    public void delete(PartsAndAccessories partsAndAccessories) {
        entityManager.remove(partsAndAccessories);
    }

    @Transactional
    public PartsAndAccessories findById(int id) {
        return entityManager.find(PartsAndAccessories.class, id);
    }

    @Transactional
    public List<PartsAndAccessories> findAll() {
        return entityManager.createQuery("from PartsAndAccessories ").getResultList();
    }

    @Transactional
    public List<PartsAndAccessories> findByName(String name) {
        return entityManager.createNamedQuery("PartsAndAccessories.findByName", PartsAndAccessories.class).setParameter("name", name).getResultList();
    }
}
