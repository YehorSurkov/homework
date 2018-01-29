package lesson9.greengrocery;

import java.util.Objects;

public class Apple extends Fruit {
    static public int appleCount = 0;
    static private double COSTPERUNITWEIGHT;

    public Apple(double weight) {
        super(weight);
        COSTPERUNITWEIGHT = 10.5;
        appleCount++;
    }

    public double getCostPerUnitOfWeight() {
        return COSTPERUNITWEIGHT;
    }

    public void setCostPerUnitOfWeight(double costPerUnitOfWeight) {
        this.COSTPERUNITWEIGHT = costPerUnitOfWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return Double.compare(COSTPERUNITWEIGHT, COSTPERUNITWEIGHT) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), COSTPERUNITWEIGHT);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "costPerUnitOfWeight=" + COSTPERUNITWEIGHT +
                '}';
    }

    @Override
    public double cost() {
        return getWeight() * COSTPERUNITWEIGHT;
    }
}
