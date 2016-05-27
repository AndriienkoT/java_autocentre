package ua.lviv.logos.dao;

import ua.lviv.logos.entity.MyOrder;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
public interface MyOrderDao {
    public void add(MyOrder myOrder);

    public void edit(MyOrder myOrder);

    public void delete(MyOrder myOrder);

    public MyOrder findById(int id);

    public List<MyOrder> findAll();

    public List<MyOrder> findByCustomer(String customer);
}
