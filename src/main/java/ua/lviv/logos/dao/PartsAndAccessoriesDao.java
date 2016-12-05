package ua.lviv.logos.dao;

import ua.lviv.logos.entity.PartsAndAccessories;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
public interface PartsAndAccessoriesDao {
    public void add(PartsAndAccessories partsAndAccessories);

    public void edit(PartsAndAccessories partsAndAccessories);

    public void delete(PartsAndAccessories partsAndAccessories);

    public PartsAndAccessories findById(int id);

    public List<PartsAndAccessories> findAll();

    public List<PartsAndAccessories> findByName(String name);
}
