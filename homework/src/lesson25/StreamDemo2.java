package lesson25;

import java.util.Arrays;
import java.util.List;

/**
 * Created by student on 18.03.2018.
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", null, "hello", "hi");
        words.stream()
                .filter(t -> t != null)
                .distinct()
                .forEach(System.out::println);
    }
}
