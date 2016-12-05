package ua.lviv.logos.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.logos.dao.MyOrderDao;
import ua.lviv.logos.dao.UsersDao;
import ua.lviv.logos.dto.MyOrderDTO;
import ua.lviv.logos.entity.MyOrder;
import ua.lviv.logos.entity.Users;
import ua.lviv.logos.service.MyOrderService;

import java.util.Date;
import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Service
public class MyOrderServiceImpl implements MyOrderService {

    @Autowired
    private MyOrderDao myOrderDao;

    @Autowired
    private UsersDao usersDao;

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
        Users users = usersDao.findById(user_id);
        myOrder.setUsers(users);
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

    @Override
    public List<MyOrder> findByOrderDate(Date order_date) {
        return myOrderDao.findByOrderDate(order_date);
    }

    @Override
    public List<MyOrder> findByAuto(String auto) {
        return myOrderDao.findByAuto(auto);
    }

    @Override
    public List<MyOrder> findByFinType(String fin_type) {
        return myOrderDao.findByFinType(fin_type);
    }

    @Override
    public List<MyOrder> findAllOrdersByUserId(int id){ return myOrderDao.findAllOrdersByUserId(id); }
}
