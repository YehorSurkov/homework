package lesson8.com.company.vehicles;

import lesson8.com.company.detailes.Engine;
import lesson8.com.company.professions.Driver;

public class SportCar extends Car {
    private double maxSpeed;

    public SportCar(String brand, String autoClass, double weight, Driver driver, Engine engine) {
        super(brand, autoClass, weight, driver, engine);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
