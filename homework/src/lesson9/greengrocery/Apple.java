package lesson9.greengrocery;

import java.util.Objects;

public class Apple extends Fruit {
    static public int appleCount = 0;
    static private double costPerUnitOfWeight;

    public Apple(double weight) {
        super(weight);
        costPerUnitOfWeight = 10.5;
        appleCount++;
    }

    public double getCostPerUnitOfWeight() {
        return costPerUnitOfWeight;
    }

    public void setCostPerUnitOfWeight(double costPerUnitOfWeight) {
        this.costPerUnitOfWeight = costPerUnitOfWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return Double.compare(costPerUnitOfWeight, costPerUnitOfWeight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), costPerUnitOfWeight);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "costPerUnitOfWeight=" + costPerUnitOfWeight +
                '}';
    }

    @Override
    public double cost() {
        return getWeight() * costPerUnitOfWeight;
    }
}
