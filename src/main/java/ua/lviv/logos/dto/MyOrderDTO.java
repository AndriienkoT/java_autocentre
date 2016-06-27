package ua.lviv.logos.dto;

import java.util.Date;

/**
 * Created by user on 12/06/2016.
 */
public class MyOrderDTO {
    private int id;
    private Date order_date;
    private String customer;
    private String auto;
    private double price;
    private String fin_type;

    public MyOrderDTO(int id, Date order_date, String customer, String auto, double price, String fin_type) {
        this.id = id;
        this.order_date = order_date;
        this.customer = customer;
        this.auto = auto;
        this.price = price;
        this.fin_type = fin_type;
    }

    public MyOrderDTO() {
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
}
