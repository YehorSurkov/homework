package lesson5;

import java.util.Arrays;

public class ArrayTwoD {
    public static void main(String[] args) {
        String[][] matrix = new String[3][6];
        char ch = 'a';
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ch + "" + (j + 1);
            }
            ch += 1;
        }
        print(matrix);

        char[][] chR = {{'0', '1'}, {'2', '3'}, {'4', '5'}, {'6', '7'}};
        deepOutput(Arrays.deepToString(chR));
    }

    private static void deepOutput(String x) {
        System.out.println(x);
    }

    private static void print(String[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
