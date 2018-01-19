package lesson7;

public class MCalculatorDemo {
    public static void main(String[] args) {

        MCalculator arr1 = new MCalculator(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        int alpha1 = 2;
        MCalculator arr2 = new MCalculator(new int[][]{{1, 2}, {4, 5}, {7, 8}});
        MCalculator arr3 = new MCalculator(new int[][]{{1, 2, 3}, {4, 5, 6}});
        MCalculator arr4 = new MCalculator(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});

        System.out.println("My matrix consists " + arr1.rawCount + "raws");

        showResult(arr1.matrix);
        showResult(arr1.addMatrixes(arr4.matrix));
        showResult(arr1.addMatrixes(arr2.matrix));
        showResult(arr1.multToNumber(alpha1));
        showResult(arr1.multMatrixRight(arr2.matrix));
        showResult(arr1.multMatrixRight(arr3.matrix));
        showResult(arr1.multMatrixRight(arr4.matrix));
    }

    public static void showResult(int[][] res) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
