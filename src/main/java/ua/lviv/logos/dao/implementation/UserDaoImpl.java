package ua.lviv.logos.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.UserDao;
import ua.lviv.logos.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(User user) {
        entityManager.persist(user);
    }

    @Transactional
    public void edit(User user) {
        entityManager.merge(user);
    }

    @Transactional
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Transactional
    public User findById(int id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public List<User> findAll() {
        return entityManager.createQuery("from User ").getResultList();
    }

    @Transactional
    public List<User> findByLogin(String login) {
        return entityManager.createNamedQuery("User.findByLogin", User.class).setParameter("login", login).getResultList();
    }

    @Transactional
    public List<User> findBySurname(String surname) {
        return entityManager.createNamedQuery("User.findBySurname", User.class).setParameter("surname", surname).getResultList();
    }
}
