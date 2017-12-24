package lesson5;

import java.util.Arrays;

public class MinMaxArr {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 0, 5, 6, 7, 8},
                {19, 27, 10, 192, 21, 90, 1, 0},
                {23, 76, 98, 12, 43, 28, 21, 1},
                {53, 95, 84, 12, 36, 32, 36, 2},
                {65, 13, 42, 98, 9, 0, 45, 345}};
        multiDimOut(arr);
        System.out.println('\n');
        minMax(arr);
    }

    public static void minMax(int[][] arr) {
        int[][] minMax = new int[arr.length][2];
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                } else if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            minMax[i][0] = min;
            minMax[i][1] = max;
            min = max = arr[i][0];
        }
        multiDimOut(minMax);
    }


    public static void multiDimOut(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }
}
