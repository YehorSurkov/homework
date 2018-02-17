package lesson16;

import java.util.Set;
import java.util.TreeSet;

public class Ex2 {
    public static void main(String[] args) {
        Set<Box> boxes = new TreeSet<>();

        boxes.add(new Box(14.4));
        boxes.add(new Box(3.3));
        boxes.add(new Box(3.1));
        boxes.add(new Box(15.7));
        boxes.add(new Box(19.1));

        boxes.forEach(System.out::println);
    }
}
