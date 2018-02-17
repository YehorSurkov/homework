package lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(14.4));
        boxes.add(new Box(3.3));
        boxes.add(new Box(3.1));
        boxes.add(new Box(15.7));
        boxes.add(new Box(19.1));

        boxes.forEach(System.out::println);

        boxes.get(0).setWeight(boxes.get(0).getWeight() + 1);
        System.out.println('\n' + boxes.get(0).toString());

        Object[] arr1 = boxes.toArray();
        System.out.println(arr1.toString() + '\n');

        Box[] arr2 = new Box[boxes.size()];
        boxes.toArray(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        Box[] arr3 = boxes.toArray(new Box[0]);
        System.out.println(Arrays.toString(arr3));

        boxes.clear();
        boxes.forEach(System.out::println);
    }
}
