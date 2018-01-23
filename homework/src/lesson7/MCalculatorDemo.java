package lesson7;

public class MCalculatorDemo {
    public static void main(String[] args) {

        MCalculator arr1 = new MCalculator(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        int alpha1 = 2;
        MCalculator arr2 = new MCalculator(new double[][]{{1, 2}, {4, 5}, {7, 8}});
        MCalculator arr3 = new MCalculator(new double[][]{{1, 2, 3}, {4, 5, 6}});
        MCalculator arr4 = new MCalculator(new double[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});

        System.out.println("My matrix consists " + arr1.getRawCount() + "raws\n");

        arr1.showResult(arr1);
        arr1.showResult(arr1.addMatrixes(arr4));
        arr1.showResult(arr1.addMatrixes(arr2));
        arr1.showResult(arr1.multToNumber(alpha1));
        arr1.showResult(arr1.multMatrixRight(arr2));
        arr1.showResult(arr1.multMatrixRight(arr3));
        arr1.showResult(arr1.multMatrixRight(arr4));
    }
}
