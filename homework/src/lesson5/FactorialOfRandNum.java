package lesson5;

public class FactorialOfRandNum {
    public static void main(String[] args) {
        int randN = (int) (Math.random() * 10);
        System.out.println(randN + "!= " + factorial(randN));
    }

    public static int factorial(int i) {
        int n = 1;
        for (int cntr = 1; cntr <= i; cntr++) {
            n = n * cntr;
        }
        return n;
    }
}

