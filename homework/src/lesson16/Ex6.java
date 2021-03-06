package lesson16;

import java.util.ArrayDeque;
import java.util.Queue;

public class Ex6 {
    public static void main(String[] args) {
        Queue<Box> boxes = new ArrayDeque<>();
        boxes.offer(new Box(14.4));
        boxes.offer(new Box(3.3));
        boxes.offer(new Box(3.1));
        boxes.offer(new Box(15.7));
        boxes.offer(new Box(19.1));

        for (Box box : boxes) {
            System.out.println(boxes.poll());
        }

        System.out.println(boxes.size());
    }
}
