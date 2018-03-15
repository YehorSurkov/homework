package lesson24;

import java.util.function.Supplier;

/**
 * Created by Student on 14.03.2018.
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> getRand = () -> (int) (Math.random() * 10);

        System.out.println(getRand.get());
        System.out.println(getRand.get());
    }
}
