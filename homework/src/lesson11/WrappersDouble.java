package lesson11;

/**
 * Created by Student on 24.01.2018.
 */
public class WrappersDouble {
    public static void main(String[] args) {
        Double d = new Double(3.141592);
        Double d1 = Double.valueOf("3.141592");
        Double d2 = Double.parseDouble("3.141592");

        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(Double.toString(d2));
        System.out.println("");
        System.out.println(d1.byteValue());
        System.out.println(d1.intValue());
        System.out.println(d1.shortValue());
        System.out.println(d1.longValue());
        System.out.println(d1.floatValue());
        System.out.println(d1.doubleValue());

        Integer y = new Integer(1);
        Integer x = y;
        y++;
        System.out.print(x == y);
    }
}
