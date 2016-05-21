package ua.lviv.logos.entity;

import javax.persistence.*;

/**
 * Created by user on 16/05/2016.
 */
@Entity
public class TechSupport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(unique = true, length = 30)
    private String support_type;
    @Column
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Car car;

    public TechSupport() {
    }

    public TechSupport(String support_type, double price) {
        this.support_type = support_type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupport_type() {
        return support_type;
    }

    public void setSupport_type(String support_type) {
        this.support_type = support_type;
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
        return "TechSupport{" +
                "id=" + id +
                ", support_type='" + support_type + '\'' +
                ", price=" + price +
                '}';
    }
}
