package lesson15;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int x = 2;
        double y = 4.7;

        System.out.println(c.sum(x, y));
        System.out.println(c.sub(x, y));
        System.out.println(c.mul(x, y));
        System.out.println(c.div(x, y));
    }
}
