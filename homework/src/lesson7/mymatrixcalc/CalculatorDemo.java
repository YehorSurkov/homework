package lesson7.mymatrixcalc;

public class CalculatorDemo {
    public static void main(String[] args) {
        Matrix arr1 = new Matrix(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix arr2 = new Matrix(new double[][]{{1, 2}, {4, 5}, {7, 8}});
        Matrix arr3 = new Matrix(new double[][]{{1, 2, 3}, {4, 5, 6}});
        Matrix arr4 = new Matrix(new double[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});
        int alpha1 = 2;

        Calculator calculator = new Calculator();
        calculator.showMatrix(arr1);

        Matrix m1 = calculator.multScalar(arr1, alpha1);
        calculator.showMatrix(m1);

        calculator.multiplication(arr3, arr2, "I don't need any new obj. I just wanna to see result");

        System.out.println(calculator.determinant(arr4));
        System.out.println(calculator.determinant(arr2));

    }
}
