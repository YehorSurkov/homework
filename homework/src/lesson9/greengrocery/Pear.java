package lesson9.greengrocery;

import java.util.Objects;

public class Pear extends Fruit {
    static public int pearCount = 0;
    private static double COSTPERUNITWEIGHT;

    public Pear(double weight) {
        super(weight);
        COSTPERUNITWEIGHT = 15.2;
        pearCount++;
    }

    public double getCostPerUnitWeight() {
        return COSTPERUNITWEIGHT;
    }

    public void setCostPerUnitWeight(double costPerUnitWeight) {
        this.COSTPERUNITWEIGHT = costPerUnitWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pear pear = (Pear) o;
        return Double.compare(pear.COSTPERUNITWEIGHT, COSTPERUNITWEIGHT) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), COSTPERUNITWEIGHT);
    }

    @Override
    public String toString() {
        return "Pear{" +
                "costPerUnitWeight=" + COSTPERUNITWEIGHT +
                '}';
    }

    @Override
    public double cost() {
        return getWeight() * COSTPERUNITWEIGHT;
    }
}
