package lesson8.com.company.vehicles;

import lesson8.com.company.detailes.Engine;
import lesson8.com.company.professions.Driver;

public class Lorry extends Car {
    public Lorry(String brand, String autoClass, double weight, Driver driver, Engine engine) {
        super(brand, autoClass, weight, driver, engine);
    }

    private double tonnage;

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }
}
