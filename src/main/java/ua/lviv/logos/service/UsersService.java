package ua.lviv.logos.service;

import ua.lviv.logos.entity.Users;

import java.util.List;

/**
 * Created by user on 06/06/2016.
 */
public interface UsersService {

    public void add(Users users);

    public void add(String name, String surname, String email, String phone, String password);

    public void edit(int id, String name, String surname, String email, String phone, String password);

    public void delete(int id);

    public Users findById(int id);

    public List<Users> findAll();

    public List<Users> findBySurname(String surname);
}
