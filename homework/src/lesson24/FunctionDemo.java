package lesson24;

import java.util.function.Function;

/**
 * Created by Student on 14.03.2018.
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> getInt = s -> {
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return 0;
            }
        };

        System.out.println(getInt.apply("abs"));
        System.out.println(getInt.apply("31"));
    }
}
