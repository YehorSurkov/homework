package lesson24;

import java.util.function.Consumer;

/**
 * Created by Student on 14.03.2018.
 */
public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<HeavyBox> outBox = hb ->
                System.out.println("Out " + hb.getWeight());

        Consumer<HeavyBox> comeBox = hb ->
                System.out.println("Come " + hb.getWeight());

        outBox.andThen(comeBox).accept(new HeavyBox(12.3));

    }
}
