package lesson9.geometry;

import java.util.Objects;

public class Circle extends Shape {
    private double xCenter;
    private double yCenter;

    public Circle(String color, double xCenter, double yCenter) {
        super(color);
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public double getxCenter() {
        return xCenter;
    }

    public void setxCenter(double xCenter) {
        this.xCenter = xCenter;
    }

    public double getyCenter() {
        return yCenter;
    }

    public void setyCenter(double yCenter) {
        this.yCenter = yCenter;
    }

    @Override
    public void draw() {
        System.out.println("( " + xCenter + " ," + yCenter + " )");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.xCenter, xCenter) == 0 &&
                Double.compare(circle.yCenter, yCenter) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(xCenter, yCenter);
    }
}
