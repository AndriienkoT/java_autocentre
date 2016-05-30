package ua.lviv.logos.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.logos.dao.UserDao;
import ua.lviv.logos.entity.User;
import ua.lviv.logos.service.UserService;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void add(String name, String surname, String email, String phone, String password) {
        User user = new User(name, surname, email, phone, password);
        userDao.add(user);
    }

    @Transactional
    public void edit(int id, String name, String surname, String email, String phone, String password) {
        User user = userDao.findById(id);
        if(name!=null){
            user.setName(name);
        }
        if(surname!=null){
            user.setSurname(surname);
        }
        if(email!=null){
            user.setEmail(email);
        }
        if(phone!=null){
            user.setPhone(phone);
        }
        if(phone!=null){
            user.setPassword(password);
        }
        userDao.edit(user);
    }

    @Transactional
    public void delete(int id) {
        User user = userDao.findById(id);
        userDao.delete(user);
    }

    @Transactional
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Transactional
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional
    public List<User> findByLogin(String login) {
        return userDao.findByLogin(login);
    }
}
