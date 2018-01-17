package lesson8;

import lesson8.com.company.detailes.Engine;
import lesson8.com.company.professions.Driver;
import lesson8.com.company.vehicles.Car;
import lesson8.com.company.vehicles.Lorry;
import lesson8.com.company.vehicles.SportCar;

public class CarDemo {
    public static void main(String[] args) {
        Engine eng1 = new Engine(30.5, "Audi LTD");
        Engine eng2 = new Engine(50.8, "Porsche mnf");
        Engine eng3 = new Engine(45.5, "UA");
        Driver drv = new Driver("Yehor", "Surkov", 23, 0);
        Car car = new Car("audi", "L", 1300, drv, eng1);
        Lorry lorry = new Lorry("KraZ", "Ukr Gruzovik", 20000, drv, eng3);
        SportCar sportC = new SportCar("Porsche", "S", 600, drv, eng2);

        car.printInfo();
        System.out.println();
        lorry.printInfo();
        System.out.println();
        sportC.printInfo();

        eng2.setPower(66.6);
        eng3.setManufacturer("UkrAuto");

        car.printInfo();
        System.out.println();
        lorry.printInfo();
        System.out.println();
        sportC.printInfo();
    }
}
