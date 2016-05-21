package ua.lviv.logos.entity;

import javax.persistence.*;

/**
 * Created by user on 16/05/2016.
 */
@Entity
public class PartsAndAccessories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(unique = true, length = 30)
    private String name;
    @Column
    private int amount;
    @Column
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Car car;

    public PartsAndAccessories() {
    }

    public PartsAndAccessories(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "PartsAndAccessories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
