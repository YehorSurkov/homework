package lesson16;

import java.util.Objects;

public class Toy {
    private String name;
    private double cost;

    public Toy() {

    }

    public Toy(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Double.compare(toy.cost, cost) == 0 &&
                Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
