package lesson15;

import java.util.Arrays;

public class MinMaxDemo {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, -4, 5, 6, 0};
        Double[] arr2 = {5.3, 4.4, -Math.PI, 0.0, 0.001};
        MinMax mm1 = new MinMax(arr1);
        MinMax mm2 = new MinMax(arr2);

        System.out.println("The smallest el of aar1 is " + mm1.min());
        System.out.println("The greatest el of aar1 is " + mm1.max());
        System.out.println("Arr1 looks like " + Arrays.toString(mm1.getArr()));

        System.out.println("The smallest el of aar2 is " + mm2.min());
        System.out.println("The greatest el of aar2 is " + mm2.max());
        System.out.println("Arr2 looks like " + Arrays.toString(mm2.getArr()));
    }
}
