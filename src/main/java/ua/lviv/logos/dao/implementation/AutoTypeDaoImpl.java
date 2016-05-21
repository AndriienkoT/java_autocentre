package ua.lviv.logos.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.AutoTypeDao;
import ua.lviv.logos.entity.AutoType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by user on 21/05/2016.
 */
@Repository
public class AutoTypeDaoImpl implements AutoTypeDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(AutoType autoType) {
        entityManager.persist(autoType);
    }

    @Transactional
    public void update(AutoType autoType) {
        entityManager.merge(autoType);
    }

    @Transactional
    public void delete(AutoType autoType) {
        entityManager.remove(autoType);
    }

    @Transactional
    public AutoType findById(int id) {
        return entityManager.find(AutoType.class, id);
    }

    @Transactional
    public List<AutoType> findAll() {
        return entityManager.createQuery("from AutoType ").getResultList();
    }
}
