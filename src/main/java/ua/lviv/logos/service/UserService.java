package ua.lviv.logos.service;

import ua.lviv.logos.entity.User;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
public interface UserService {
    public void add(String name, String surname, String email, String phone);

    public void edit(int id, String name, String surname, String email, String phone);

    public void delete(int id);

    public User findById(int id);

    public List<User> findAll();

    public List<User> findByPhone(String phone);
}
