package lesson16;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Ex3 {
    public static void main(String[] args) {
        Set<Box> boxes1 = new TreeSet<>();
        Set<Box> boxes2 = new TreeSet<>();
        Set<Box> boxes3 = new TreeSet<>();


        boxes1.add(new Box(14.4));
        boxes1.add(new Box(3.3));
        boxes1.add(new Box(3.1));

        boxes2.add(new Box(15.7));
        boxes2.add(new Box(19.1));
        boxes2.add(new Box(3.1));

        boxes3.add(new Box(11.7));
        boxes3.add(new Box(12.1));

        union(boxes1, boxes2, boxes3).forEach(System.out::println);
        System.out.println();
        intersect(boxes1, boxes2).forEach(System.out::println);
        System.out.println();
        intersect(boxes2, boxes3).forEach(System.out::println);
    }

    static Set<?> union(Set<?>... set) {
        TreeSet<?> result = new TreeSet<>();
        for (Set<?> s : set) {
            result.addAll((Collection) s);
        }
        return result;
    }

    static Set<?> intersect(Set<?>... set) {
        TreeSet<?> result = (TreeSet) set[1];
        for (Set<?> s : set) {
            result.retainAll(s);
        }
        return result;
    }
}
