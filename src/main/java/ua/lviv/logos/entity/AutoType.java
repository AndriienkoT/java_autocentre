package ua.lviv.logos.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 14/05/2016.
 */

@Entity
public class AutoType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(length = 10, unique = true)
    private String auto_type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "autoType")
    private List<Car>carList;

    public AutoType() {
    }

    public AutoType(String auto_type) {
        this.auto_type = auto_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuto_type() {
        return auto_type;
    }

    public void setAuto_type(String auto_type) {
        this.auto_type = auto_type;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "AutoType{" +
                "id=" + id +
                ", auto_type='" + auto_type + '\'' +
                '}';
    }
}
