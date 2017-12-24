package lesson4;

import java.util.Scanner;

/**
 * Show the lowest by absolute value from three given numbers
 */

public class TheLowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer number ");
        int i, j, k;
        if (sc.hasNextInt()) {
            i = abs(sc.nextInt());
            System.out.println(i + " is a number 1\n");
            System.out.print("Input an integer number");
            if (sc.hasNextInt()) {
                j = abs(sc.nextInt());
                System.out.println(j + " is a number 2\n");
                System.out.print("Input an integer number");
                if (sc.hasNextInt()) {
                    k = abs(sc.nextInt());
                    System.out.println(k + " is a number 3\n");
                    if ((i < j) && (i < k)) {
                        System.out.println("The lowest value is " + i);
                    } else if ((j < i) && (j < k)) {
                        System.out.println("The lowest value is " + j);
                    } else {
                        System.out.println("The lowest value is " + k);
                    }
                } else {
                    System.out.println("Error ");
                }
            } else {
                System.out.println("Error ");
            }
        } else {
            System.out.println("Error ");
        }
    }

    public static int abs(int i) {
        i = (i >= 0) ? i : -i;
        return i;
    }
}
