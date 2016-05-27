package ua.lviv.logos.service;

import ua.lviv.logos.entity.MyOrder;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
public interface MyOrderService {
    public void add(String customer, String auto, double price, String fin_type);

    public void edit(int id, String customer, String auto, double price, String fin_type);

    public void edit(int id, String customer, String auto, double price, String fin_type, int user_id);

    public void delete(int id);

    public MyOrder findById(int id);

    public List<MyOrder> findAll();

    public List<MyOrder> findByCustomer(String customer);
}
