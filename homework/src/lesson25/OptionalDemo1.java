package lesson25;

import java.util.Optional;

/**
 * Created by student on 18.03.2018.
 */
public class OptionalDemo1 {
    public static void main(String[] args) {
        Optional<Integer> opt1 = Optional.empty();
        Optional<Integer> opt2 = Optional.of(3);
        Optional<Integer> opt3 = Optional.ofNullable(null);

        System.out.println(opt1.isPresent());
        System.out.println(opt2.isPresent());
        System.out.println(opt3.isPresent());
        System.out.println();
        opt1.ifPresent(System.out::println);
        opt2.ifPresent(System.out::println);
        opt3.ifPresent(System.out::println);
        System.out.println();
        //System.out.println(opt1.get());
        System.out.println(opt2.get());
        //System.out.println(opt3.get());
        System.out.println();
        System.out.println(opt3.orElse(666));

    }
}
