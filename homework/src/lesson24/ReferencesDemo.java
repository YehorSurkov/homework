package lesson24;

import java.util.function.IntFunction;
import java.util.function.Supplier;

public class ReferencesDemo {
    public static void main(String[] args) {
        IntFunction<String> function = i -> String.valueOf(i);
        System.out.println(function.apply(450));

        IntFunction<String> function1 = String::valueOf;
        System.out.println(function1.apply(450));


        Supplier<String> newString = () -> new String();
        System.out.println(newString.get());

        Supplier<String> newString1 = String::new;
        System.out.println(newString1.get());
    }
}
