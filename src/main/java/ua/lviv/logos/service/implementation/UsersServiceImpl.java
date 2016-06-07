package ua.lviv.logos.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.lviv.logos.dao.UsersDao;
import ua.lviv.logos.entity.Users;
import ua.lviv.logos.service.UsersService;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 06/06/2016.
 */
@Service("usersDetailsService")
public class UsersServiceImpl implements UsersService, UserDetailsService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = null;
        try {
            users = usersDao.findByLogin(username);
        } catch (NoResultException e) {
            return  null;
        }
        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return new User(String.valueOf(users.getId()), users.getPassword(),authorityList);
    }

    @Override
    public void add(Users users) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        usersDao.add(users);
    }

    @Override
    public void add(String name, String surname, String email, String phone, String password) {
        Users users = new Users(name, surname, email, phone, password);
        usersDao.add(users);
    }

    @Override
    public void edit(int id, String name, String surname, String email, String phone, String password) {
        Users users = usersDao.findById(id);
        if(name!=null){
            users.setName(name);
        }
        if(surname!=null){
            users.setSurname(surname);
        }
        if(email!=null){
            users.setEmail(email);
        }
        if(phone!=null){
            users.setPhone(phone);
        }
        if(phone!=null){
            users.setPassword(password);
        }
        usersDao.edit(users);
    }

    @Override
    public void delete(int id) {
        Users users = usersDao.findById(id);
        usersDao.delete(users);
    }

    @Override
    public Users findById(int id) {
        return usersDao.findById(id);
    }

    @Override
    public List<Users> findAll() {
        return usersDao.findAll();
    }

    @Override
    public List<Users> findBySurname(String surname) {
        return usersDao.findBySurname(surname);
    }
}
