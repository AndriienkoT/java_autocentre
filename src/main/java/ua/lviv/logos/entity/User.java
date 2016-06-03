package ua.lviv.logos.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 16/05/2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "User.findBySurname", query = "SELECT u FROM User u where u.surname like :surname"),
        @NamedQuery(name = "User.findByLogin", query = "SELECT u FROM User u where u.phone like :phone or u.email like :email")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(length = 10)
    private String name;
    @Column(length = 15)
    private String surname;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<MyOrder> myOrderList;

    public User() {
    }

    public User(String name, String surname, String email, String phone, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<MyOrder> getMyOrderList() {
        return myOrderList;
    }

    public void setOrdeRList(List<MyOrder> myOrderList) {
        this.myOrderList = myOrderList;
    }
}
