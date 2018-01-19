package lesson7;

public class Recursion {

    int rec(int a, int b) {
        if (a == b) {
            System.out.print(a);
            return a;
        }
        System.out.print(a + " ");
        return rec(a + (b - a) / Math.abs(a - b), b);
    }
}
