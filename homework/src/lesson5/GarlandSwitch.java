package lesson5;

import java.util.Scanner;

public class GarlandSwitch {
    public static void main(String[] args) {
        int yourChoice;
        int garlandNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input a 'garland number'");
        if (scanner.hasNextInt()) {
            garlandNum = scanner.nextInt();
        } else {
            System.out.println("It's not a right num(");
        }
        System.out.print("Please, specify case");
        if (scanner.hasNextInt()) {
            yourChoice = scanner.nextInt();
        } else {
            System.out.println("No proper case was found(");
            yourChoice = 0;
        }
        switch (yourChoice) {
            case 1:
                showGarland(garlandNum);
                break;
            case 2:
                checkFirstSwitched(garlandNum);
            case 3:
                blinker(garlandNum, 5);
            case 4:
                runningPath(garlandNum);
            default:
                showGarland(-1);
        }
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

