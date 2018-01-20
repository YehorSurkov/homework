package lesson9.greengrocery;

import java.util.Objects;

public class Pear extends Fruit {
    static public int pearCount = 0;
    private double costPerUnitWeight;

    public Pear(double weight) {
        super(weight);
        this.costPerUnitWeight = 15.2;
        pearCount++;
    }

    public double getCostPerUnitWeight() {
        return costPerUnitWeight;
    }

    public void setCostPerUnitWeight(double costPerUnitWeight) {
        this.costPerUnitWeight = costPerUnitWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pear pear = (Pear) o;
        return Double.compare(pear.costPerUnitWeight, costPerUnitWeight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), costPerUnitWeight);
    }

    @Override
    public String toString() {
        return "Pear{" +
                "costPerUnitWeight=" + costPerUnitWeight +
                '}';
    }

    @Override
    public double cost() {
        return getWeight() * costPerUnitWeight;
    }
}
