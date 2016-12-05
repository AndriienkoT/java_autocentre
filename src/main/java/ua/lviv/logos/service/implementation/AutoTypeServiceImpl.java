package ua.lviv.logos.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.AutoTypeDao;
import ua.lviv.logos.entity.AutoType;
import ua.lviv.logos.service.AutoTypeService;

import java.util.List;

/**
 * Created by user on 22/05/2016.
 */
@Service
public class AutoTypeServiceImpl implements AutoTypeService {

    @Autowired
    private AutoTypeDao autoTypeDao;

    @Transactional
    public void add(String auto_type) {
        AutoType autoType = new AutoType(auto_type);
        autoTypeDao.add(autoType);
    }

    @Transactional
    public void edit(int id, String auto_type) {
        AutoType autoType = autoTypeDao.findById(id);
        if(auto_type!=null){
            autoType.setAuto_type(auto_type);
        }
        autoTypeDao.edit(autoType);
    }

    @Transactional
    public void delete(int id) {
        AutoType autoType = autoTypeDao.findById(id);
        autoTypeDao.delete(autoType);
    }

    @Transactional
    public AutoType findById(int id) {
        return autoTypeDao.findById(id);
    }

    @Transactional
    public List<AutoType> findAll() {
        return autoTypeDao.findAll();
    }
}
