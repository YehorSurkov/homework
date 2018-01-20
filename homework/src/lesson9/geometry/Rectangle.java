package lesson9.geometry;

import java.util.Objects;

public class Rectangle extends Shape {
    private double xUpLeft, yUpLeft, xDownRight, yDownRight;

    public Rectangle(String color, double xUpLeft, double yUpLeft, double xDownRight, double yDownRight) {
        super(color);
        this.xUpLeft = xUpLeft;
        this.yUpLeft = yUpLeft;
        this.xDownRight = xDownRight;
        this.yDownRight = yDownRight;
    }

    public double getxUpLeft() {
        return xUpLeft;
    }

    public void setxUpLeft(double xUpLeft) {
        this.xUpLeft = xUpLeft;
    }

    public double getyUpLeft() {
        return yUpLeft;
    }

    public void setyUpLeft(double yUpLeft) {
        this.yUpLeft = yUpLeft;
    }

    public double getxDownRight() {
        return xDownRight;
    }

    public void setxDownRight(double xDownRight) {
        this.xDownRight = xDownRight;
    }

    public double getyDownRight() {
        return yDownRight;
    }

    public void setyDownRight(double yDownRight) {
        this.yDownRight = yDownRight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.xUpLeft, xUpLeft) == 0 &&
                Double.compare(rectangle.yUpLeft, yUpLeft) == 0 &&
                Double.compare(rectangle.xDownRight, xDownRight) == 0 &&
                Double.compare(rectangle.yDownRight, yDownRight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(xUpLeft, yUpLeft, xDownRight, yDownRight);
    }

    @Override
    public void draw() {
        System.out.println(xUpLeft + " " + yUpLeft + " " + xDownRight + " " + yDownRight);
    }
}
