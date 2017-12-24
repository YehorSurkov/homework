package lesson3;

import java.util.Scanner;

/**
 * This pack represents a class for point2 task in Homework3.
 * This class verify if an input value is mathematically integer.
 * In this is true it classifies this v5
 * Value as odd or even by bite AND to 1.
 */

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, input an integer number: ");

        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (byteAnd(i) == 0) {
                System.out.println("This number is even.");
            } else {
                System.out.println("This value is odd.");
            }
        } else {
            System.out.println("Your value isn't integer!");
        }
    }

    public static int byteAnd(int i) {
        return i & 1;
    }
}