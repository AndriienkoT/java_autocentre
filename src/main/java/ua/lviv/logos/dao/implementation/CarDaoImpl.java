package ua.lviv.logos.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.CarDao;
import ua.lviv.logos.dto.CarDTO;
import ua.lviv.logos.entity.Car;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Repository
public class CarDaoImpl implements CarDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(Car car) {
        entityManager.persist(car);
    }

    @Transactional
    public void edit(Car car) {
        entityManager.merge(car);
    }

    @Transactional
    public void delete(Car car) {
        entityManager.remove(car);
    }

    @Transactional
    public Car findById(int id) {
        return entityManager.find(Car.class, id);
    }

    @Transactional
    public List<CarDTO> findAll() {
        return entityManager.createQuery("from Car ").getResultList();
    }

    @Transactional
    public List<Car> findByModel(String model) {
        return entityManager.createNamedQuery("Car.findByModel", Car.class).setParameter("model", model).getResultList();
    }

    @Transactional
    public List<Car> findByEngineVolume(double engine_volume) {
        return entityManager.createNamedQuery("Car.findByEngineVolume", Car.class).setParameter("engine_volume", engine_volume).getResultList();
    }

    @Transactional
    public List<Car> findByYearOfIssue(int year_of_issue) {
        return entityManager.createNamedQuery("Car.findByYearOfIssue", Car.class).setParameter("year_of_issue", year_of_issue).getResultList();
    }
}
