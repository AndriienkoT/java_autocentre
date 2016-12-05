package ua.lviv.logos.dao;

import ua.lviv.logos.entity.TechSupport;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
public interface TechSupportDao {
    public void add(TechSupport techSupport);

    public void edit(TechSupport techSupport);

    public void delete(TechSupport techSupport);

    public TechSupport findById(int id);

    public List<TechSupport> findAll();

    public List<TechSupport> findBySupportType(String support_type);
}
