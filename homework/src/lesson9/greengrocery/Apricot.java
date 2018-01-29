package lesson9.greengrocery;

import java.util.Objects;

public class Apricot extends Fruit {
    static public int apricotCount = 0;
    private static double COSTPERUNITWEIGHT;

    public Apricot(double weight) {
        super(weight);
        COSTPERUNITWEIGHT = 30.5;
        apricotCount++;
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
        Apricot apricot = (Apricot) o;
        return Double.compare(COSTPERUNITWEIGHT, COSTPERUNITWEIGHT) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), COSTPERUNITWEIGHT);
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "costPerUnitWeight=" + COSTPERUNITWEIGHT +
                '}';
    }

    @Override
    public double cost() {
        return getWeight() * COSTPERUNITWEIGHT;
    }
}
