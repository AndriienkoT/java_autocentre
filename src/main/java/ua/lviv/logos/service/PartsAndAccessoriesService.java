package ua.lviv.logos.service;

import ua.lviv.logos.entity.PartsAndAccessories;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
public interface PartsAndAccessoriesService {
    public void add(String name, int amount, double price);

    public void edit(int id, String name, int amount, double price);

    public void edit(int id, String name, int amount, double price, int car_id);

    public void delete(int id);

    public PartsAndAccessories findById(int id);

    public List<PartsAndAccessories> findAll();

    public List<PartsAndAccessories> findByName(String name);
}
