package ua.lviv.logos.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by user on 19/05/2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "MyOrder.findByOrderDate", query = "SELECT o FROM MyOrder o where o.order_date like :order_date"),
        @NamedQuery(name = "MyOrder.findByCustomer", query = "SELECT o FROM MyOrder o where o.customer like :customer")
})
public class MyOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private Date order_date;
    @Column(length = 30)
    private String customer;
    @Column(length = 30)
    private String auto;
    @Column
    private double price;
    @Column(length = 10)
    private String fin_type;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    private Financing financing;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "car_order", joinColumns = @JoinColumn(name = "id_order"), inverseJoinColumns = @JoinColumn(name = "id_car"))
    private List<Car> carList;

    public MyOrder() {
    }

    public MyOrder(String customer, String auto, double price, String fin_type) {
        this.order_date = Calendar.getInstance().getTime();
        this.customer = customer;
        this.auto = auto;
        this.price = price;
        this.fin_type = fin_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFin_type() {
        return fin_type;
    }

    public void setFin_type(String fin_type) {
        this.fin_type = fin_type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Financing getFinancing() {
        return financing;
    }

    public void setFinancing(Financing financing) {
        this.financing = financing;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
