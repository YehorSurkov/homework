package lesson10.clothes;

import java.util.Objects;

/**
 * Created by Student on 24.01.2018.
 */
public abstract class Clothes {
    private Sizes size;
    private double cost;
    private String color;

    public Clothes(Sizes size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return Double.compare(clothes.cost, cost) == 0 &&
                size == clothes.size &&
                Objects.equals(color, clothes.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(size, cost, color);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
