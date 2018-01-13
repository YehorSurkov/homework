package lesson8.com.company.vehicles;

import lesson8.com.company.detailes.Engine;
import lesson8.com.company.professions.Driver;

public class Car {
    private String brand;
    private String autoClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String autoClass, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.autoClass = autoClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAutoClass() {
        return autoClass;
    }

    public void setAutoClass(String autoClass) {
        this.autoClass = autoClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void start() {
        System.out.println("Go!");
    }

    public void stop() {
        System.out.println("Stop!");
    }

    public void turnRight() {
        System.out.println("Turn to the right");
    }

    public void turnLeft() {
        System.out.println("Turn to the left");
    }

    public void printInfo() {
        System.out.println(brand);
        System.out.println(autoClass);
        System.out.println(weight);
        System.out.println(driver);
        System.out.println(engine);
    }

}
