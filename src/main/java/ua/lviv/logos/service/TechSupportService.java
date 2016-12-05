package ua.lviv.logos.service;

import ua.lviv.logos.entity.TechSupport;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
public interface TechSupportService {
    public void add(String support_type, double price);

    public void edit(int id, String support_type, double price);

    public void edit(int id, String support_type, double price, int car_id);

    public void delete(int id);

    public TechSupport findById(int id);

    public List<TechSupport> findAll();

    public List<TechSupport> findBySupportType(String support_type);
}
