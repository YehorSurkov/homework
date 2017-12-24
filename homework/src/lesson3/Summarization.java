package lesson3;

import java.util.Scanner;

/**
 * This class summarize two inputs.
 */
public class Summarization {
    public static void main(String[] args) {
        Scanner scX = new Scanner(System.in);
        System.out.print("Input val1 : ");
        if (scX.hasNextInt()) {
            int x = scX.nextInt();
            System.out.print("Input val2 : ");
            if (scX.hasNextInt()) {
                int y = scX.nextInt();
                System.out.println("val1 + val2 = " + sum(x, y));
            } else {
                System.out.println(" System Error! ");
            }
        } else {
            System.out.println(" System Error! ");
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}

