package lesson9;

import java.util.Objects;

public class Circle {
    final double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circleArea() {
        return pi * Math.pow(radius, 2);
    }

    public double circleLength() {
        return 2 * pi * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.pi, pi) == 0 &&
                Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(pi, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
