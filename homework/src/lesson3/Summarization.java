package lesson3;

import java.util.Scanner;

/**
 * This class summarize two inputs.
 */
public class Summarization {
    public static void main(String[] args) {
        Scanner scX = new Scanner(System.in);
        boolean cycle = true;
        int[] x = new int[2];
        for (int i = 1; i < 3; i++) {
            x[i - 1] = inputVal(scX, i);
            if (x[i - 1] == -2147483648) {
                cycle = false;
                break;
            }
        }
        if (cycle == true) {
            System.out.println("Val1 + Val2 = " + sum(x));
        } else {
            System.out.println("Sorry(");
        }
    }

    public static int inputVal(Scanner scX, int i) {
        System.out.print("Input val" + i + " : ");
        int x;
        if (scX.hasNextInt()) {
            x = scX.nextInt();
        } else {
            System.out.println("Error!!! Don't believe in obtained results!");
            x = -2147483648;
        }
        return x;
    }

    public static int sum(int[] x) {
        return x[0] + x[1];
    }
}

