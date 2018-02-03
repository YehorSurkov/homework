package lesson9.greengrocery;

import java.util.Objects;

public class Pear extends Fruit {
    public static int pearCount = 0;
    private final double COST_PER_UNIT_WEIGHT;

    public Pear(double weight) {
        super(weight);
        COST_PER_UNIT_WEIGHT = 15.2;
        pearCount++;
    }

    public double getCostPerUnitWeight() {
        return COST_PER_UNIT_WEIGHT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pear pear = (Pear) o;
        return Double.compare(pear.COST_PER_UNIT_WEIGHT, COST_PER_UNIT_WEIGHT) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), COST_PER_UNIT_WEIGHT);
    }

    @Override
    public String toString() {
        return "Pear{" +
                "costPerUnitWeight=" + COST_PER_UNIT_WEIGHT +
                '}';
    }

    @Override
    public double cost() {
        return getWeight() * COST_PER_UNIT_WEIGHT;
    }
}
