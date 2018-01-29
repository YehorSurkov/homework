package lesson7.mymatrixcalc;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {
    public double[][] matrix;
    public int colCount, rowCount;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        rowCount = matrix.length;
        colCount = matrix[0].length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return colCount == matrix1.colCount &&
                rowCount == matrix1.rowCount &&
                Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(colCount, rowCount);
        result = 31 * result + Arrays.hashCode(matrix);
        return result;
    }
}
