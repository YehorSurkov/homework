package lesson5;

import java.util.Scanner;

public class PositiveNumberLessTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Specify your value ");
        if (sc.hasNextInt()) {
            checkerNum(sc.nextInt());
        } else {
            System.out.println("Your value isn't correct");
        }
    }

    public static void checkerNum(int i) {
        if ((i >= 0) && (i <= 10)) {
            System.out.println("Yes, this value is positive and less than ten");
        } else {
            System.out.println("No, this value isn't positive or over 10");
        }
    }
}
