package lesson4;

import java.util.Scanner;

/**
 * Show the lowest by absolute value from three given numbers
 */

public class TheLowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] val = new int[3];
        boolean cycle = true;
        for (int i = 0; i < 3; i++) {
            System.out.print("Input an integer number ");
            val[i] = inputVal(sc, i);
            if (val[i] == -2147483648) {
                cycle = false;
                break;
            }
        }
        if (cycle != false) {
            int theLowest = abs(val[0]);
            for (int cntr = 1; cntr < val.length; cntr++) {
                if (theLowest > abs(val[cntr])) {
                    theLowest = val[cntr];
                }
            }
            System.out.println("The lowest by absolute value is " + theLowest);
        }
    }

    public static int inputVal(Scanner sc, int i) {
        int x;
        if (sc.hasNextInt()) {
            x = sc.nextInt();
            System.out.println(x + " is a number" + (i + 1) + "\n");
        } else {
            System.out.println("Error!!!");
            x = -2147483648;
        }
        return x;
    }

    public static int abs(int i) {
        i = (i >= 0) ? i : -i;
        return i;
    }
}
