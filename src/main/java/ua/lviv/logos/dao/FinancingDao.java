package ua.lviv.logos.dao;

import ua.lviv.logos.entity.Financing;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
public interface FinancingDao {
    public void add(Financing financing);

    public void edit(Financing financing);

    public void delete(Financing financing);

    public Financing findById(int id);

    public List<Financing> findAll();

    public List<Financing> findByType(String type);
}
