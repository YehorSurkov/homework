package lesson7;

public class MCalculatorDemo {
    public static void main(String[] args) {
        MCalculator result1, result2, result3, result4, result5, result6;
        MCalculator arr1 = new MCalculator(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        int alpha1 = 2;
        MCalculator arr2 = new MCalculator(new double[][]{{1, 2}, {4, 5}, {7, 8}});
        MCalculator arr3 = new MCalculator(new double[][]{{1, 2, 3}, {4, 5, 6}});
        MCalculator arr4 = new MCalculator(new double[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});

        System.out.println("My matrix consists " + arr1.getRawCount() + "raws\n");

        arr1.showResult();

        result1 = arr1.addMatrixes(arr4);
        result1.showResult();

        result2 = arr1.addMatrixes(arr2);
        result2.showResult();

        result3 = arr1.multToNumber(alpha1);
        result3.showResult();

        result4 = arr1.multMatrixRight(arr2);
        result4.showResult();

        result5 = arr1.multMatrixRight(arr3);
        result5.showResult();

        result6 = arr1.multMatrixRight(arr4);
        result6.showResult();
    }
}
