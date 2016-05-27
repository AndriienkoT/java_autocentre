package ua.lviv.logos.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.logos.dao.MyOrderDao;
import ua.lviv.logos.dao.UserDao;
import ua.lviv.logos.entity.MyOrder;
import ua.lviv.logos.entity.User;
import ua.lviv.logos.service.MyOrderService;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Service
public class MyOrderServiceImpl implements MyOrderService {

    @Autowired
    private MyOrderDao myOrderDao;

    @Autowired
    private UserDao userDao;

    @Override
    public void add(String customer, String auto, double price, String fin_type) {
        MyOrder myOrder = new MyOrder(customer, auto, price, fin_type);
        myOrderDao.add(myOrder);
    }

    @Override
    public void edit(int id, String customer, String auto, double price, String fin_type) {
        MyOrder myOrder = myOrderDao.findById(id);
        if(customer!=null){
            myOrder.setCustomer(customer);
        }
        if(auto!=null){
            myOrder.setAuto(auto);
        }
        if(price>0){
            myOrder.setPrice(price);
        }
        if(fin_type!=null){
            myOrder.setFin_type(fin_type);
        }
        myOrderDao.edit(myOrder);
    }

    @Override
    public void edit(int id, String customer, String auto, double price, String fin_type, int user_id) {
        MyOrder myOrder = myOrderDao.findById(id);
        if(customer!=null){
            myOrder.setCustomer(customer);
        }
        if(auto!=null){
            myOrder.setAuto(auto);
        }
        if(price>0){
            myOrder.setPrice(price);
        }
        if(fin_type!=null){
            myOrder.setFin_type(fin_type);
        }
        User user = userDao.findById(user_id);
        myOrder.setUser(user);
        myOrderDao.edit(myOrder);
    }

    @Override
    public void delete(int id) {
        MyOrder myOrder = myOrderDao.findById(id);
        myOrderDao.delete(myOrder);
    }

    @Override
    public MyOrder findById(int id) {
        return myOrderDao.findById(id);
    }

    @Override
    public List<MyOrder> findAll() {
        return myOrderDao.findAll();
    }

    @Override
    public List<MyOrder> findByCustomer(String customer) {
        return myOrderDao.findByCustomer(customer);
    }
}
