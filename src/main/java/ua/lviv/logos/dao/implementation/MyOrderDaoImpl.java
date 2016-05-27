package ua.lviv.logos.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.MyOrderDao;
import ua.lviv.logos.entity.MyOrder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Repository
public class MyOrderDaoImpl implements MyOrderDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(MyOrder myOrder) {
        entityManager.persist(myOrder);
    }

    @Transactional
    public void edit(MyOrder myOrder) {
        entityManager.merge(myOrder);
    }

    @Transactional
    public void delete(MyOrder myOrder) {
        entityManager.remove(myOrder);
    }

    @Transactional
    public MyOrder findById(int id) {
        return entityManager.find(MyOrder.class, id);
    }

    @Transactional
    public List<MyOrder> findAll() {
        return entityManager.createQuery("from MyOrder ").getResultList();
    }

    @Transactional
    public List<MyOrder> findByCustomer(String customer) {
        return entityManager.createNamedQuery("MyOrder.findByCustomer", MyOrder.class).setParameter("customer", customer).getResultList();
    }
}
