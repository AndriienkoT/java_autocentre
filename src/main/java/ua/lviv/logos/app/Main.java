package ua.lviv.logos.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by user on 14/05/2016.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Main");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

/*
        entityManager.persist(new AutoType("new auto"));
        entityManager.persist(new AutoType("used auto"));

        entityManager.persist(new Car("A1", "", 1.4, "TSI", 2016, 0, 26000));
        entityManager.persist(new Car("A5", "Sportback", 2.0, "TSI", 2016, 0, 45000));

        entityManager.persist(new Financing("credit", 60, 23));
        entityManager.persist(new Financing("leasing", 36, 21));

        entityManager.persist(new MyOrder("Markov Denis", "Audi A5 Sportback 3.0TSI", 52000, "credit"));

        entityManager.persist(new PartsAndAccessories("tyre", 20, 1200));
        entityManager.persist(new PartsAndAccessories("oil", 10, 120));

        entityManager.persist(new TechSupport("TO 1", 1000));
        entityManager.persist(new TechSupport("TO 2", 2100));

        entityManager.persist(new User("Denis", "Markov", "markov.d@gmail.com", "0972543265", "markov"));
        entityManager.persist(new User("Kostya", "Stem", "stem.k@gmail.com", "09612345147", "stem"));
*/
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
