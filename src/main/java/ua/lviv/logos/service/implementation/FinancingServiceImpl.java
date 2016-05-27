package ua.lviv.logos.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.FinancingDao;
import ua.lviv.logos.entity.Financing;
import ua.lviv.logos.service.FinancingService;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Service
public class FinancingServiceImpl implements FinancingService{

    @Autowired
    private FinancingDao financingDao;

    @Transactional
    public void add(String type, int term, double percent) {
        Financing financing = new Financing(type, term, percent);
        financingDao.add(financing);
    }

    @Transactional
    public void edit(int id, String type, int term, double percent) {
        Financing financing = financingDao.findById(id);
        if(type!=null){
            financing.setType(type);
        }
        if(term>0){
            financing.setTerm(term);
        }
        if(percent>0){
            financing.setPercent(percent);
        }
        financingDao.edit(financing);
    }

    @Transactional
    public void delete(int id) {
        Financing financing = financingDao.findById(id);
        financingDao.delete(financing);
    }

    @Transactional
    public Financing findById(int id) {
        return financingDao.findById(id);
    }

    @Transactional
    public List<Financing> findAll() {
        return financingDao.findAll();
    }

    @Transactional
    public List<Financing> findByType(String type) {
        return financingDao.findByType(type);
    }
}
