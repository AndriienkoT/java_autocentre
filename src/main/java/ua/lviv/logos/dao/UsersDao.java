package ua.lviv.logos.dao;

import ua.lviv.logos.entity.Users;

import java.util.List;

/**
 * Created by user on 06/06/2016.
 */
public interface UsersDao {
    public void add(Users users);

    public void edit(Users users);

    public void delete(Users users);

    public Users findById(int id);

    public List<Users> findAll();

    public Users findByLogin(String login);

    public List<Users> findBySurname(String surname);
}
