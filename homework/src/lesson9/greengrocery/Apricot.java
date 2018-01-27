package lesson9.greengrocery;

import java.util.Objects;

public class Apricot extends Fruit {
    static public int apricotCount = 0;
    private static double costPerUnitWeight;

    public Apricot(double weight) {
        super(weight);
        costPerUnitWeight = 30.5;
        apricotCount++;
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
        Apricot apricot = (Apricot) o;
        return Double.compare(costPerUnitWeight, costPerUnitWeight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), costPerUnitWeight);
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "costPerUnitWeight=" + costPerUnitWeight +
                '}';
    }

    @Override
    public double cost() {
        return getWeight() * costPerUnitWeight;
    }
}
