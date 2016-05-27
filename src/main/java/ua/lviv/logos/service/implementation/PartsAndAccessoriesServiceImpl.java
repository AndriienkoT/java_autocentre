package ua.lviv.logos.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.CarDao;
import ua.lviv.logos.dao.PartsAndAccessoriesDao;
import ua.lviv.logos.entity.Car;
import ua.lviv.logos.entity.PartsAndAccessories;
import ua.lviv.logos.service.PartsAndAccessoriesService;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Service
public class PartsAndAccessoriesServiceImpl implements PartsAndAccessoriesService {

    @Autowired
    private PartsAndAccessoriesDao partsAndAccessoriesDao;

    @Autowired
    private CarDao carDao;

    @Transactional
    public void add(String name, int amount, double price) {
        PartsAndAccessories partsAndAccessories = new PartsAndAccessories(name, amount, price);
        partsAndAccessoriesDao.add(partsAndAccessories);
    }

    @Transactional
    public void edit(int id, String name, int amount, double price) {
        PartsAndAccessories partsAndAccessories = partsAndAccessoriesDao.findById(id);
        if(name!=null){
            partsAndAccessories.setName(name);
        }
        if(amount>0){
            partsAndAccessories.setAmount(amount);
        }
        if(price>0){
            partsAndAccessories.setPrice(price);
        }
        partsAndAccessoriesDao.edit(partsAndAccessories);
    }

    @Transactional
    public void edit(int id, String name, int amount, double price, int car_id) {
        PartsAndAccessories partsAndAccessories = partsAndAccessoriesDao.findById(id);
        if(name!=null){
            partsAndAccessories.setName(name);
        }
        if(amount>0){
            partsAndAccessories.setAmount(amount);
        }
        if(price>0){
            partsAndAccessories.setPrice(price);
        }
        Car car = carDao.findById(car_id);
        partsAndAccessories.setCar(car);
        partsAndAccessoriesDao.edit(partsAndAccessories);
    }

    @Transactional
    public void delete(int id) {
        PartsAndAccessories partsAndAccessories = partsAndAccessoriesDao.findById(id);
        partsAndAccessoriesDao.delete(partsAndAccessories);
    }

    @Transactional
    public PartsAndAccessories findById(int id) {
        return partsAndAccessoriesDao.findById(id);
    }

    @Transactional
    public List<PartsAndAccessories> findAll() {
        return partsAndAccessoriesDao.findAll();
    }

    @Transactional
    public List<PartsAndAccessories> findByName(String name) {
        return partsAndAccessoriesDao.findByName(name);
    }
}
