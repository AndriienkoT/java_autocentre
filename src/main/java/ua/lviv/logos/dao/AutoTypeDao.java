package ua.lviv.logos.dao;

import ua.lviv.logos.entity.AutoType;

import java.util.List;

/**
 * Created by user on 21/05/2016.
 */
public interface AutoTypeDao {
    public void add(AutoType autoType);

    public void edit(AutoType autoType);

    public void delete(AutoType autoType);

    public AutoType findById(int id);

    public List<AutoType> findAll();
}
