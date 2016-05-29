package ua.lviv.logos.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 14/05/2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Car.findByModel", query = "SELECT c FROM Car c where c.model like :model"),
        @NamedQuery(name = "Car.findByEngineVolume", query = "SELECT c FROM Car c where c.engine_volume like :engine_volume"),
        @NamedQuery(name = "Car.findByYearOfIssue", query = "SELECT c FROM Car c where c.year_of_issue like :year_of_issue")
})
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(length = 10)
    private String model;
    @Column(length = 10)
    private String equipment;
    @Column
    private double engine_volume;
    @Column(length = 10)
    private String engine_type;
    @Column
    private int year_of_issue;
    @Column
    private double mileage;
    @Column
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private AutoType autoType;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "car")
    private List<PartsAndAccessories> partsAndAccessoriesList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "car")
    private List<TechSupport> techSupportList;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "car_order", joinColumns = @JoinColumn(name = "id_car"), inverseJoinColumns = @JoinColumn(name = "id_order"))
    private List<MyOrder>myOrderList;

    public Car() {
    }

    public Car(String model, String equipment, double engine_volume, String engine_type, int year_of_issue, double mileage, double price) {
        this.model = model;
        this.equipment = equipment;
        this.engine_volume = engine_volume;
        this.engine_type = engine_type;
        this.year_of_issue = year_of_issue;
        this.mileage = mileage;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public double getEngine_volume() {
        return engine_volume;
    }

    public void setEngine_volume(double engine_volume) {
        this.engine_volume = engine_volume;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(int year_of_issue) {
        this.year_of_issue = year_of_issue;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public AutoType getAutoType() {
        return autoType;
    }

    public void setAutoType(AutoType autoType) {
        this.autoType = autoType;
    }

    public List<PartsAndAccessories> getPartsAndAccessoriesList() {
        return partsAndAccessoriesList;
    }

    public void setPartsAndAccessoriesList(List<PartsAndAccessories> partsAndAccessoriesList) {
        this.partsAndAccessoriesList = partsAndAccessoriesList;
    }

    public List<TechSupport> getTechSupportList() {
        return techSupportList;
    }

    public void setTechSupportList(List<TechSupport> techSupportList) {
        this.techSupportList = techSupportList;
    }

    public List<MyOrder> getMyOrderList() {
        return myOrderList;
    }

    public void setOrdeRList(List<MyOrder> myOrderList) {
        this.myOrderList = myOrderList;
    }
}
