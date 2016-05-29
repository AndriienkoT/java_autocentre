package ua.lviv.logos.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 16/05/2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Financing.findByType", query = "SELECT f FROM Financing f where f.type like :type")
})
public class Financing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(length = 10)
    private String type;
    @Column
    private int term;
    @Column
    private double percent;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "financing")
    private List<MyOrder>myOrderList;

    public Financing() {
    }

    public Financing(String type, int term, double percent) {
        this.type = type;
        this.term = term;
        this.percent = percent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public List<MyOrder> getMyOrderList() {
        return myOrderList;
    }

    public void setOrdeRList(List<MyOrder> myOrderList) {
        this.myOrderList = myOrderList;
    }
}
