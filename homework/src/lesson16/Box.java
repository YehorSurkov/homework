package lesson16;

import java.util.Objects;

public class Box implements Comparable {
    private double weight;
    private double height;
    private double length;
    private double width;

    public Box(double weight) {
        this.weight = weight;
        height = Math.round(10 * Math.random());
        length = Math.round(15 * Math.random());
        width = Math.round(20 * Math.random());
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.weight, weight) == 0 &&
                Double.compare(box.height, height) == 0 &&
                Double.compare(box.length, length) == 0 &&
                Double.compare(box.width, width) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight, height, length, width);
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public double getVolume() {
        return height * length * width;
    }

    @Override
    public int compareTo(Object o) {
        Box o1 = (Box) o;
        if (this.weight - o1.getWeight() > 0) {
            return 1;
        } else if (this.weight - o1.getWeight() == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
