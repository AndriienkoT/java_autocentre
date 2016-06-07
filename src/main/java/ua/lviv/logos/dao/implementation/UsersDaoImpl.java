package ua.lviv.logos.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.UsersDao;
import ua.lviv.logos.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by user on 06/06/2016.
 */
@Repository
public class UsersDaoImpl implements UsersDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(Users users) {
        entityManager.persist(users);
    }

    @Transactional
    public void edit(Users users) {
        entityManager.merge(users);
    }

    @Transactional
    public void delete(Users users) {
        entityManager.remove(users);
    }

    @Transactional
    public Users findById(int id) {
        return entityManager.find(Users.class, id);
    }

    @Transactional
    public List<Users> findAll() {
        return entityManager.createQuery("from Users ").getResultList();
    }

    @Transactional
    public Users findByLogin(String login) {
        return entityManager.createNamedQuery("Users.findByLogin", Users.class).setParameter("login", login).getSingleResult();
    }

    @Transactional
    public List<Users> findBySurname(String surname) {
        return entityManager.createNamedQuery("Users.findBySurname", Users.class).setParameter("surname", surname).getResultList();
    }
}
