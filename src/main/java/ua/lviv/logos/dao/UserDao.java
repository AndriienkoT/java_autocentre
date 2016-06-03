package ua.lviv.logos.dao;

import ua.lviv.logos.entity.User;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
public interface UserDao {
    public void add(User user);

    public void edit(User user);

    public void delete(User user);

    public User findById(int id);

    public List<User> findAll();

    public List<User> findByLogin(String login);

    public List<User> findBySurname(String surname);
}
