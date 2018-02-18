package lesson16;

import java.util.ArrayDeque;
import java.util.Queue;

public class Ex7 {
    public static void main(String[] args) {
        Queue<Box> boxes = new ArrayDeque<>();
        boxes.offer(new Box(14.4));
        boxes.offer(new Box(3.3));
        boxes.offer(new Box(3.1));
        boxes.offer(new Box(15.7));
        boxes.offer(new Box(19.1));

        Queue<Box> boxes1 = hhb(boxes);
        boxes1.forEach(System.out::println);
    }

    public static Queue<Box> hhb(Queue<Box> boxes) {
        Queue<Box> result = new ArrayDeque<>();
        for (Box box : boxes) {
            if (boxes.peek().getWeight() > 4) {
                result.offer(boxes.poll());
            } else {
                boxes.poll();
            }
        }
        return result;
    }
}
