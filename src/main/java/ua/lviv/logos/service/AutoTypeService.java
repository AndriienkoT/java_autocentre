package ua.lviv.logos.service;

import ua.lviv.logos.entity.AutoType;

import java.util.List;

/**
 * Created by user on 22/05/2016.
 */
public interface AutoTypeService {
    public void add(String auto_type);

    public void edit(int id, String auto_type);

    public void delete(int id);

    public AutoType findById(int id);

    public List<AutoType> findAll();
}
