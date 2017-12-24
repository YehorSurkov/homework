package lesson4;

import java.util.Scanner;

/**
 * Christmas Garland and Bitwise Operations
 */

public class ChristmasGarland {
    public static void main(String[] args) {
        int garland = 0;
        int numTimes = 0;
        System.out.println("***Hello, I'm ChristmasGarlandProG***\n");
        System.out.println("I show each method only once\n");
        System.out.println("Please, specify a 'galrand value'");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value from -2147483648 to  2147483647\n");
        if (sc.hasNextInt()) {
            garland = sc.nextInt();
        } else {
            System.out.println("Error! ");
        }
        System.out.println("\n");
        System.out.println("This is my initial state (binary form)");
        showGarland(garland);
        System.out.println("\n");
        System.out.println("Do I have my first fire switched on?");
        checkFirstSwitched(garland);
        System.out.println("\n");
        System.out.println("Pathway");
        runningPath(garland);
        System.out.println("\n");
        System.out.print("How many times should I blink?\n");
        if (sc.hasNextInt()) {
            numTimes = sc.nextInt();
        } else {
            System.out.println("Error! ");
        }
        blinker(garland, numTimes);
    }

    public static void checkFirstSwitched(int first) {
        if ((first & 1) == 1) {
            System.out.println("Yap, the firs one is switched on:)");
        } else {
            System.out.println("Nope");
        }
    }

    public static void showGarland(int i) {
        System.out.println(Integer.toBinaryString(i));
    }

    public static void blinker(int i, int n) {
        int j = i;
        for (int cntr = n; cntr > 0; cntr--) {
            j = ~j;
            showGarland(j);
        }
    }

    public static void runningPath(int i) {
        for (int cntr = 15; cntr >= 0; cntr--) {
            i = i >>> 1;
            showGarland(i);
        }
    }
}
