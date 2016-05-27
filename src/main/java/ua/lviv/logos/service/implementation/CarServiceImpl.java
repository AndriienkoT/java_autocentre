package ua.lviv.logos.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.AutoTypeDao;
import ua.lviv.logos.dao.CarDao;
import ua.lviv.logos.entity.AutoType;
import ua.lviv.logos.entity.Car;
import ua.lviv.logos.service.CarService;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Autowired
    private AutoTypeDao autoTypeDao;

    @Transactional
    public void add(String model, String equipment, double engine_volume, String engine_type, int year_of_issue, double mileage, double price) {
        Car car = new Car(model, equipment, engine_volume, engine_type, year_of_issue, mileage, price);
        carDao.add(car);
    }

    @Transactional
    public void edit(int id, String model, String equipment, double engine_volume, String engine_type, int year_of_issue, double mileage, double price) {
        Car car = carDao.findById(id);
        if(model!=null){
            car.setModel(model);
        }
        if(equipment!=null){
            car.setEquipment(equipment);
        }
        if(engine_volume>0){
            car.setEngine_volume(engine_volume);
        }
        if(engine_type!=null){
            car.setEngine_type(engine_type);
        }
        if(year_of_issue>0){
            car.setYear_of_issue(year_of_issue);
        }
        if(mileage>0){
            car.setMileage(mileage);
        }
        if(price>0){
            car.setPrice(price);
        }
        carDao.edit(car);
    }

    @Transactional
    public void edit(int id, String model, String equipment, double engine_volume, String engine_type, int year_of_issue, double mileage, double price, int auto_type_id) {
        Car car = carDao.findById(id);
        if(model!=null){
            car.setModel(model);
        }
        if(equipment!=null){
            car.setEquipment(equipment);
        }
        if(engine_volume>0){
            car.setEngine_volume(engine_volume);
        }
        if(engine_type!=null){
            car.setEngine_type(engine_type);
        }
        if(year_of_issue>0){
            car.setYear_of_issue(year_of_issue);
        }
        if(mileage>0){
            car.setMileage(mileage);
        }
        if(price>0){
            car.setPrice(price);
        }
        AutoType autoType = autoTypeDao.findById(auto_type_id);
        car.setAutoType(autoType);
        carDao.edit(car);
    }

    @Transactional
    public void delete(int id) {
        Car car = carDao.findById(id);
        carDao.delete(car);
    }

    @Transactional
    public Car findById(int id) {
        return carDao.findById(id);
    }

    @Transactional
    public List<Car> findAll() {
        return carDao.findAll();
    }

    @Transactional
    public List<Car> findByModel(String model) {
        return carDao.findByModel(model);
    }
}
