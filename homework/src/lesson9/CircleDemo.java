package lesson9;

public class CircleDemo {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(13), new Circle(10), new Circle(9)};
        for (Circle c : circles) {
            System.out.println("Radius is " + c.getRadius());
            System.out.println("Area is " + c.circleArea());
            System.out.println("Length is " + c.circleLength());
        }
    }
}
