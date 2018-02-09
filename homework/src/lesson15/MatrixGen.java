package lesson15;

public class MatrixGen<T extends Number> {
    private int colCount;
    private int rawCount;
    private T[][] matrix;

    public MatrixGen(T[][] mat) {
        rawCount = mat.length;
        colCount = mat[0].length;
        matrix = mat;
    }

    public int getCallCount() {
        return colCount;
    }

    public void setCallCount(int callCount) {
        this.colCount = callCount;
    }

    public int getRawCount() {
        return rawCount;
    }

    public void setRawCount(int rawCount) {
        this.rawCount = rawCount;
    }

    public T[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public MatrixGen addMatrixes(MatrixGen m) {
        MatrixGen r = new MatrixGen(new Double[rawCount][colCount]);
        if ((rawCount == m.matrix.length) && (colCount == m.matrix[0].length)) {
            for (int i = 0; i < rawCount; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    r.matrix[i][j] = matrix[i][j].doubleValue() + m.matrix[i][j].doubleValue();
                }
            }
            return r;
        } else {
            System.out.println("Wrong size");
            return new MatrixGen(new Double[1][1]);
        }
    }

    public MatrixGen multToNumber(double alpha) {
        MatrixGen r = new MatrixGen(new Double[rawCount][colCount]);
        for (int i = 0; i < rawCount; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                r.matrix[i][j] = matrix[i][j].doubleValue() * alpha;
            }
        }
        return r;
    }

    public MatrixGen multMatrixRight(MatrixGen m) {
        if (colCount == m.matrix.length) {
            Double[][] res = new Double[rawCount][m.matrix[0].length];
            for (int i = 0; i < rawCount; i++) {
                for (int j = 0; j < m.matrix[0].length; j++) {
                    res[i][j] = 0.0;
                    for (int cntr = 0; cntr < colCount; cntr++)
                        res[i][j] += matrix[i][cntr].doubleValue() * m.matrix[cntr][j].doubleValue();
                }
            }
            return new MatrixGen(res);
        } else {
            System.out.println("Wrong size");
            return new MatrixGen(new Double[1][1]);
        }
    }

    public void showResult() {
        for (T[] raw : matrix) {
            for (T el : raw) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
