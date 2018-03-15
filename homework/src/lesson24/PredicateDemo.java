package lesson24;

import java.util.function.Predicate;

/**
 * Created by Student on 14.03.2018.
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> isNotNull = s -> s != null;
        System.out.println(isNotNull.test(null));
        System.out.println(isNotNull.test("abs"));

        System.out.println();
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotNull.test(""));
        System.out.println(isNotNull.test("abs"));

        System.out.println(isNotNull.and(isNotEmpty).test(null));
        System.out.println(isNotNull.and(isNotEmpty).test(""));
        System.out.println(isNotNull.and(isNotEmpty).test("abc"));
    }
}
