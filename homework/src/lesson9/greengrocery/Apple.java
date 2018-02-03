package lesson9.greengrocery;

import java.util.Objects;

public class Apple extends Fruit {
    public static int appleCount = 0;
    private final double COST_PER_UNIT_WEIGHT;

    public Apple(double weight) {
        super(weight);
        COST_PER_UNIT_WEIGHT = 10.5;
        appleCount++;
    }

    public double getCostPerUnitOfWeight() {
        return COST_PER_UNIT_WEIGHT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return Double.compare(COST_PER_UNIT_WEIGHT, COST_PER_UNIT_WEIGHT) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), COST_PER_UNIT_WEIGHT);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "costPerUnitOfWeight=" + COST_PER_UNIT_WEIGHT +
                '}';
    }

    @Override
    public double cost() {
        return getWeight() * COST_PER_UNIT_WEIGHT;
    }
}
