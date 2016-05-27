package ua.lviv.logos.service;

import ua.lviv.logos.entity.Financing;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
public interface FinancingService {
    public void add(String type, int term, double percent);

    public void edit(int id, String type, int term, double percent);

    public void delete(int id);

    public Financing findById(int id);

    public List<Financing> findAll();

    public List<Financing> findByType(String type);
}
