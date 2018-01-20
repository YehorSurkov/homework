package lesson9.geometry;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] fig = {new Rectangle("ellow", 1.1, 2.3, 4.5, 6), new Circle("Red", 5, 6)};

        for (Shape f : fig) {
            f.draw();
        }
    }
}
