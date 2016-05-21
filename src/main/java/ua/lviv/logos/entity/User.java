package ua.lviv.logos.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 16/05/2016.
 */
@Entity
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<MyOrder> myOrderList;

    public User() {
    }

    public User(String name, String surname, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
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

    public List<MyOrder> getMyOrderList() {
        return myOrderList;
    }

    public void setOrdeRList(List<MyOrder> myOrderList) {
        this.myOrderList = myOrderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
