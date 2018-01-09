package lesson7;

public class MCalculatorDemo {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int alpha1 = 2;
        int[][] arr2 = {{1, 2}, {4, 5}, {7, 8}};
        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr4 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        MCalculator matrix = new MCalculator(arr1);
        System.out.println("My matrix consists " + matrix.rawCount + "raws");

        matrix.showResult(matrix.matrix);
        matrix.addMatrixes(arr4);
        matrix.addMatrixes(arr2);
        matrix.multToNumber(alpha1);
        matrix.multMatrixRight(arr2);
        matrix.multMatrixRight(arr3);
        matrix.multMatrixRight(arr4);
    }
}
