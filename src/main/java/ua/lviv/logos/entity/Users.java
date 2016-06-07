package ua.lviv.logos.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 06/06/2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Users.findBySurname", query = "SELECT u FROM Users u where u.surname like :surname"),
        @NamedQuery(name = "Users.findByLogin", query = "SELECT u FROM Users u where u.phone like :login or u.email like :login")
})
public class Users {
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
    private List<MyOrder> myOrderList;

    public Users() {
    }

    public Users(String name, String surname, String email, String phone, String password) {
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

    public void setMyOrderList(List<MyOrder> myOrderList) {
        this.myOrderList = myOrderList;
    }
}
