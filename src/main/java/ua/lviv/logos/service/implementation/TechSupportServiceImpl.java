package ua.lviv.logos.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.CarDao;
import ua.lviv.logos.dao.TechSupportDao;
import ua.lviv.logos.entity.Car;
import ua.lviv.logos.entity.TechSupport;
import ua.lviv.logos.service.TechSupportService;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Service
public class TechSupportServiceImpl implements TechSupportService{

    @Autowired
    private TechSupportDao techSupportDao;

    @Autowired
    private CarDao carDao;

    @Transactional
    public void add(String support_type, double price) {
        TechSupport techSupport = new TechSupport(support_type, price);
        techSupportDao.add(techSupport);
    }

    @Transactional
    public void edit(int id, String support_type, double price) {
        TechSupport techSupport = techSupportDao.findById(id);
        if(support_type!=null){
            techSupport.setSupport_type(support_type);
        }
        if(price>0){
            techSupport.setPrice(price);
        }
        techSupportDao.edit(techSupport);
    }

    @Transactional
    public void edit(int id, String support_type, double price, int car_id) {
        TechSupport techSupport = techSupportDao.findById(id);
        if(support_type!=null){
            techSupport.setSupport_type(support_type);
        }
        if(price>0){
            techSupport.setPrice(price);
        }
        Car car = carDao.findById(car_id);
        techSupport.setCar(car);
        techSupportDao.edit(techSupport);
    }

    @Transactional
    public void delete(int id) {
        TechSupport techSupport = techSupportDao.findById(id);
        techSupportDao.delete(techSupport);
    }

    @Transactional
    public TechSupport findById(int id) {
        return techSupportDao.findById(id);
    }

    @Transactional
    public List<TechSupport> findAll() {
        return techSupportDao.findAll();
    }

    @Transactional
    public List<TechSupport> findBySupportType(String support_type) {
        return techSupportDao.findBySupportType(support_type);
    }
}
