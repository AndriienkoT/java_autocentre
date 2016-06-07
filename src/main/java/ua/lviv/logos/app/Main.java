package ua.lviv.logos.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.lviv.logos.service.*;

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

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/AppContext.xml");
        AutoTypeService autoTypeService = context.getBean(AutoTypeService.class);
        CarService carService = context.getBean(CarService.class);
        FinancingService financingService = context.getBean(FinancingService.class);
        MyOrderService myOrderService = context.getBean(MyOrderService.class);
        PartsAndAccessoriesService partsAndAccessoriesService = context.getBean(PartsAndAccessoriesService.class);
        TechSupportService techSupportService = context.getBean(TechSupportService.class);
        UsersService usersService = context.getBean(UsersService.class);
/*
        autoTypeService.add("new auto");
        autoTypeService.add("used auto");

        carService.add("A1", "", 1.4, "TSI", 2016, 0, 26000);
        carService.add("A5", "Sportback", 2.0, "TSI", 2016, 0, 45000);

        financingService.add("credit", 60, 23);
        financingService.add("leasing", 36, 21);

        myOrderService.add("Markov Denis", "A5 Sportback 3.0TSI", 52000, "credit");
        myOrderService.add("Voronin Ivan", "A4 2.0TDI", 43000, "credit");

        partsAndAccessoriesService.add("tyre", 20, 1200);
        partsAndAccessoriesService.add("oil", 10, 120);

        techSupportService.add("TO 1", 1000);
        techSupportService.add("TO 2", 2100);

        usersService.add("Denis", "Markov", "markov.d@gmail.com", "0972543265", "markov");
        usersService.add("Ivan", "Voronin", "voronin.i@gmail.com", "0682015478", "voronin");
*/
        context.close();
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
