package ua.lviv.logos.dto;

/**
 * Created by user on 09/06/2016.
 */
public class CarDTO {
    private int id;
    private String model;
    private String equipment;
    private double engine_volume;
    private String engine_type;
    private int year_of_issue;
    private double mileage;
    private double price;
    private String picture;

    public CarDTO(String model, String equipment, double engine_volume, String engine_type, int year_of_issue, double mileage, double price) {
        this.model = model;
        this.equipment = equipment;
        this.engine_volume = engine_volume;
        this.engine_type = engine_type;
        this.year_of_issue = year_of_issue;
        this.mileage = mileage;
        this.price = price;
    }

    public CarDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(int year_of_issue) {
        this.year_of_issue = year_of_issue;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public double getEngine_volume() {
        return engine_volume;
    }

    public void setEngine_volume(double engine_volume) {
        this.engine_volume = engine_volume;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
